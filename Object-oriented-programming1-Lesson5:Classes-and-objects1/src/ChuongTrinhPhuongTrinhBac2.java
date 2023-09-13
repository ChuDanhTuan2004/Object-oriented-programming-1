import java.util.Scanner;

public class ChuongTrinhPhuongTrinhBac2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root " + root);
        } else {
            System.out.println("The equation has no roots.");
        }
    }

    public static class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public QuadraticEquation() {
            a = 0;
            b = 0;
            c = 0;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }
        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }
    }
}
