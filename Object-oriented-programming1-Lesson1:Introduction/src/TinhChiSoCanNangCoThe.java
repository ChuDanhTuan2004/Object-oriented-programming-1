import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weigth, height, bmi;
        System.out.print("Your weight (kg)");
        weigth = sc.nextDouble();
        System.out.print("Your height (m)");
        height = sc.nextDouble();

        bmi = weigth / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
