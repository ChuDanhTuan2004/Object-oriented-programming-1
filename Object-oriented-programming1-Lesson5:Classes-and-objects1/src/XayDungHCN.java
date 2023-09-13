import java.util.Scanner;

public class XayDungHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter width: ");
        int width=sc.nextInt();
        System.out.print("Please enter height: ");
        int height=sc.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("This is your rectangle: ");
        rectangle.drawRectangle();
        System.out.println("Now let's create a new rectangle: "+"\n");
        System.out.print("Please enter width: ");
        rectangle.setWidth(sc.nextInt());
        System.out.print("Please enter height: ");
        rectangle.setHeight(sc.nextInt());
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+rectangle.getPerimeter());

    }

    public static class Rectangle {
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }


        public double getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        int width;

        public double getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        int height;

        public int getArea(){
            return width*height;
        }
        public int getPerimeter(){
            return 2*(width+height);
        }
        public void drawRectangle(){
            for (int i=1;i<=height;i++){
                for (int j=1;j<=width;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
