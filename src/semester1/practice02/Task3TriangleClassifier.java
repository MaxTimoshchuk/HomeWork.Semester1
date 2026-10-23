package semester1.practice02;

public class Task3TriangleClassifier {
    static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
        boolean equal = (a == b) && (a == c);
        boolean isosceles = a == b || a == c || a == b;
        boolean rectangular = (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2));
        System.out.println("Чи існує такий трикутник: " + exists);
        System.out.println("Чи є рівностороннім: " + equal);
        System.out.println("Чи є рівнобедреним: " + isosceles);
        System.out.println("Чи є прямокутним: " + rectangular);
    }
}
