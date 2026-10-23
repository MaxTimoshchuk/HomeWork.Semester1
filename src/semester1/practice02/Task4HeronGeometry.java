package semester1.practice02;

public class Task4HeronGeometry {
    static void main(String[] args) {
        double a = 7.0;
        System.out.println("a: " + a);
        double b = 8.0;
        System.out.println("b: " + b);
        double c = 9.0;
        System.out.println("c: " + c);

        System.out.println("-------------------------------");

        double P = a + b + c;
        System.out.println("P: " + P);

        double p = P / 2;
        System.out.println("p: " + p);

        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("S: " + S);

        double r = S / p;
        System.out.println("r: " + r);

        double sCircle = Math.PI * Math.pow(r, 2);
        System.out.println("S вписаного: " + sCircle);

        double R = (a * b * c) / (S * 4);
        System.out.println("R: " + R);

        double describedСircle = Math.PI * Math.pow(R, 2);
        System.out.println("S овисаного: " + describedСircle);



    }
}
