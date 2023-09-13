import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of prime numbers to print: ");
        int numbers = input.nextInt();
        int count = 0;
        int N = 2;

        while (count < numbers) {
            boolean isPrime = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
