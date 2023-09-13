import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1: Khai bao va khoi tao mang so nguyen gom N phan tu cho truoc.
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int n = array.length;

        // Buoc 2: Nhap X la so can chen.
        System.out.print("Nhap so can chen: ");
        int x = scanner.nextInt();

        // Buoc 3: Nhap vao vi tri index can chen X vao trong mang.
        System.out.print("Nhap vi tri can chen: ");
        int index = scanner.nextInt();

        // Buoc 4: Neu index <= -1 va index >= array.length - 1 thi hien thi khong chen duoc phan tu vao mang.
        if (index < 0 || index > n) {
            System.out.println("Khong chen duoc phan tu vao mang.");
        } else {
            // Buoc 5: Thuc hien chen phan tu X o vi tri index vao mang.
            int[] newArray = new int[n + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = x;
            for (int i = index + 1; i < n + 1; i++) {
                newArray[i] = array[i - 1];
            }
            array = newArray;
            n++;

            // Buoc 6: In ra mang.
            System.out.print("Mang sau khi chen " + x + " vao vi tri " + index + " la: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
