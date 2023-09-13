import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        final int SIZE = 5; // kích thước mảng
        int[] arr = new int[SIZE]; // khai báo mảng

        Scanner input = new Scanner(System.in);

        // nhập giá trị cho các phần tử trong mảng
        System.out.println("Nhập " + SIZE + " số nguyên:");
        for (int i = 0; i < SIZE; i++) {
            arr[i] = input.nextInt();
        }

        // gán phần tử đầu tiên là giá trị nhỏ nhất
        int min = arr[0];

        // duyệt mảng từ phần tử thứ 2 đến hết mảng
        for (int i = 1; i < SIZE; i++) {
            // so sánh phần tử tiếp theo với giá trị nhỏ nhất
            if (arr[i] < min) {
                // nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất
                // thì gán giá trị nhỏ nhất là phần tử tiếp theo
                min = arr[i];
            }
        }

        // in ra giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
