import java.util.Scanner;

public class DemSoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
        // Bước 1: Khai báo và gán giá trị cho chuỗi str
        String str = "This is a sample string.";

        // Bước 2: Khai báo và nhập giá trị cho biến c
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự cần đếm trong chuỗi: ");
        char c = scanner.nextLine().charAt(0);

        // Bước 3: Khai báo và gán giá trị cho biến count
        int count = 0;

        // Bước 4: Duyệt từng ký tự trong chuỗi và đếm số ký tự cần đếm
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        // Bước 5: In ra số lần xuất hiện của ký tự c trong chuỗi
        System.out.println("Số lần xuất hiện của ký tự " + c + " trong chuỗi là: " + count);
    }
}
