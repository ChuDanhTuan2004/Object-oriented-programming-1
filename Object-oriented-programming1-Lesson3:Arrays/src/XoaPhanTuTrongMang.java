import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1: Khai bao va khoi tao mang so nguyen gom N phan tu cho truoc.
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int n = array.length;

        // Buoc 2: Nhap X la phan tu can xoa.
        System.out.print("Nhap phan tu can xoa: ");
        int x = scanner.nextInt();

        // Buoc 3: Tim X xem co xuat hien trong mang khong. Neu xuat hien chi ra vi tri cua X.
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Khong tim thay phan tu can xoa trong mang.");
        } else {
            System.out.println("Tim thay phan tu can xoa tai vi tri " + index_del + ".");
            // Buoc 4: Xoa phan tu X khoi mang.
            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            n--;
            // Buoc 5: Ket thuc duyet mang. In ra mang.
            System.out.print("Mang sau khi xoa phan tu " + x + " la: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
