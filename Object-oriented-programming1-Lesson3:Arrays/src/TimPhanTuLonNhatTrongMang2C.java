import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        // Tìm phần tử lớn nhất
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // In ra phần tử lớn nhất và tọa độ
        System.out.println("Max element: " + max);
        System.out.println("\n" + "Row: " + maxRow + "\n" + "Column: " + maxCol);

        // Thay đổi ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
