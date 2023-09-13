import java.util.Scanner;

public class ChuongTrinhNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter the temperature in Celsius (The minimum acceptable value is -273 degrees Celsius): ");
        } while (sc.nextInt() < -273);
        Temperature temperature= new Temperature(25);
        System.out.println("Temperature F: "+temperature.getF());
        System.out.println("Temperature K: "+temperature.getK());
    }

    public static class Temperature {
        int C;

        public Temperature(int c) {
            C = c;
        }

        public double getF() {
            return C * (9 / 5) + 32;
        }

        public double getK() {
            return C + 273.15;
        }
    }
}
