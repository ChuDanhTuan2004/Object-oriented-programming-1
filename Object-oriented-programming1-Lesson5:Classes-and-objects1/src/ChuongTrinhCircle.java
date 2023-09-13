import java.util.Scanner;

public class ChuongTrinhCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle(2);
        System.out.println("Radius: " + circle.GetRadius());
        System.out.println("Area: " + circle.GetArea());
        System.out.println(circle.toString());
    }

    public static class Circle {
        public Circle() {
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", area='" + GetArea() + '\'' +
                    '}';
        }

        double radius;
        String color;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double GetRadius() {
            return radius;
        }

        public double GetArea() {
            return Math.PI * radius * radius;
        }
    }
}
