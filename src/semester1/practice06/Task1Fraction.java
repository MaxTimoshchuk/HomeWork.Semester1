package semester1.practice06;

public class Task1Fraction {
    private int numerator;
    private int denominator;

    public Task1Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Task1Fraction(int num, int den) {
        setValues(num, den);
    }

    public void setValues(int num, int den) {
        if (den == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            this.denominator = 1;
            this.numerator = num;
            return;
        }
        if (den < 0) {
            this.numerator = -num;
            this.denominator = -den;
        } else {
            this.numerator = num;
            this.denominator = den;
        }
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a == 0 ? 1 : a;
    }

    public void simplify() {
        if (numerator == 0) {
            denominator = 1;
            return;
        }
        int commonDivider = gcd(numerator, denominator);
        numerator /= commonDivider;
        denominator /= commonDivider;
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public void add(int otherNum, int otherDen) {
        if (otherDen == 0) {
            System.out.println("Помилка: знаменник другого дробу не може дорівнювати 0!");
            return;
        }
        int newNum = this.numerator * otherDen + otherNum * this.denominator;
        int newDen = this.denominator * otherDen;

        this.numerator = newNum;
        this.denominator = newDen;
        simplify();
    }

    public void printFraction() {
        if (denominator == 1) {
            System.out.print(numerator);
        } else {
            System.out.print(numerator + "/" + denominator);
        }
    }
}