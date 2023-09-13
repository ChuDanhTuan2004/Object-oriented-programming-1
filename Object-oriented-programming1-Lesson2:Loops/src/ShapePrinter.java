import java.util.Scanner;

public class ShapePrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the length: ");
                    int length = scan.nextInt();
                    System.out.print("Enter the width: ");
                    int width = scan.nextInt();
                    printRectangle(length, width);
                    break;
                case 2:
                    System.out.println("1. Top-left");
                    System.out.println("2. Top-right");
                    System.out.println("3. Bottom-left");
                    System.out.println("4. Bottom-right");
                    System.out.print("Enter your choice: ");
                    int choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter the size: ");
                            int size = scan.nextInt();
                            printTopLeftSquareTriangle(size);
                            break;
                        case 2:
                            System.out.print("Enter the size: ");
                            size = scan.nextInt();
                            printTopRightSquareTriangle(size);
                            break;
                        case 3:
                            System.out.print("Enter the size: ");
                            size = scan.nextInt();
                            printBottomLeftSquareTriangle(size);
                            break;
                        case 4:
                            System.out.print("Enter the size: ");
                            size = scan.nextInt();
                            printBottomRightSquareTriangle(size);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Enter the size: ");
                    int size = scan.nextInt();
                    printIsoscelesTriangle(size);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (option != 4);
        scan.close();
    }

    public static void printRectangle(int length, int width) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTopLeftSquareTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }}

        public static void printTopRightSquareTriangle ( int size){
            for (int i = 1; i <= size; i++) {
                for (int j = size; j > 0; j--) {
                    if (j > i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }

        public static void printBottomLeftSquareTriangle ( int size){
            for (int i = size; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void printBottomRightSquareTriangle ( int size){
            for (int i = size; i >= 1; i--) {
                for (int j = size; j > 0; j--) {
                    if (j > i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }

        public static void printIsoscelesTriangle ( int size){
            for (int i = 1; i <= size; i++) {
                for (int j = size - i; j >= 1; j--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

