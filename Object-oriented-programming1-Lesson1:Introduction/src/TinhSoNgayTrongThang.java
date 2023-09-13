import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month that you want to count days?");
        int month = sc.nextInt();
        String daysinMonth;
        switch (month) {
            case 2:
                daysinMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysinMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysinMonth = "30";
                break;
            default:
                daysinMonth = "";
        }
        if (daysinMonth != "") {
            System.out.printf("The month '%d' has %s days!", month, daysinMonth);
        } else {
            System.out.print("Invalid input");
        }
    }
}
