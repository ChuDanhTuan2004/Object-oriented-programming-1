import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        for (int v = 2; v < 100; v++) {
            boolean isPrime = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("So nguyen to nho hon 100 thu " + (count+1) + " la " + N);
                count++;
            }
            N++;
        }
    }
}
