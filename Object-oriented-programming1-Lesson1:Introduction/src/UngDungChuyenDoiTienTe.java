import java.sql.SQLOutput;
import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien usd: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gia tri vnd: " + quydoi);
    }
}
