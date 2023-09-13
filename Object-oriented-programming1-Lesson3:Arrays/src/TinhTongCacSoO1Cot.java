import java.util.Scanner;

public class TinhTongCacSoO1Cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Nhập số cột cần tính tổng: ");
        int col = scanner.nextInt()-1;

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += array[i][col];
        }

        System.out.println("Tổng của cột " + (col+1) + " là " + sum);
    }
}
