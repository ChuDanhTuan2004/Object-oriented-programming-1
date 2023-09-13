import java.util.Scanner;

public class ChuongTrinhDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        Date MyDate = new Date(day,month,year);
        System.out.println("Today is: "+ MyDate.display());

    }

    public static class Date {
        public Date() {
        }

        int day, month, year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int GetDay() {
            return this.day;
        }

        public int GetMonth() {
            return this.month;
        }

        public int GetYear() {
            return this.year;
        }

        public void GetDay(int day) {
            this.day = day;
        }

        public void GetMonth(int month) {
            this.month = month;
        }

        public void GetYear(int year) {
            this.year = year;
        }

        public void SetDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String display() {
            return day + "/" + month + "/" + year;
        }
    }
}
