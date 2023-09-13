import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to read: ");
        int num = sc.nextInt();

        if (num >= 0 && num < 10) {
            switch (num) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (num >= 10 && num < 20) {
            switch (num) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (num >= 20 && num < 100) {
            int tens = num / 10;
            int ones = num % 10;
            String tensString;
            String onesString;

            switch (tens) {
                case 2:
                    tensString = "twenty";
                    break;
                case 3:
                    tensString = "thirty";
                    break;
                case 4:
                    tensString = "forty";
                    break;
                case 5:
                    tensString = "fifty";
                    break;
                case 6:
                    tensString = "sixty";
                    break;
                case 7:
                    tensString = "seventy";
                    break;
                case 8:
                    tensString = "eighty";
                    break;
                case 9:
                    tensString = "ninety";
                    break;
                default:
                    tensString = "";
                    break;
            }

            switch (ones) {
                case 1:
                    onesString = "one";
                    break;
                case 2:
                    onesString = "two";
                    break;
                case 3:
                    onesString = "three";
                    break;
                case 4:
                    onesString = "four";
                    break;
                case 5:
                    onesString = "five";
                    break;
                case 6:
                    onesString = "six";
                    break;
                case 7:
                    onesString = "seven";
                    break;
                case 8:
                    onesString = "eight";
                    break;
                case 9:
                    onesString = "nine";
                    break;
                default:
                    onesString = "";
                    break;
            }

            System.out.println(tensString + " " + onesString);

        } else if (num >= 100 && num < 1000) {
            int hundreds = num / 100;
            int tensAndOnes = num % 100;
            String hundredsString;
            String tensAndOnesString;

            switch (hundreds) {
                case 1:
                    hundredsString = "one hundred";
                    break;
                case 2:
                    hundredsString = "two hundred";
                    break;
                case 3:
                    hundredsString = "three hundred";
                    break;
                case 4:
                    hundredsString = "four hundred";
                    break;
                case 5:
                    hundredsString = "five hundred";
                    break;
                case 6:
                    hundredsString = "six hundred";
                    break;
                case 7:
                    hundredsString = "seven hundred";
                    break;
                case 8:
                    hundredsString = "eight hundred";
                    break;
                case 9:
                    hundredsString = "nine hundred";
                    break;
                default:
                    hundredsString = "";
                    break;
            }

            if (tensAndOnes >= 20) {
                int tens = tensAndOnes / 10;
                int ones = tensAndOnes % 10;
                String tensString;
                String onesString;

                switch (tens) {
                    case 2:
                        tensString = "twenty";
                        break;
                    case 3:
                        tensString = "thirty";
                        break;
                    case 4:
                        tensString = "forty";
                        break;
                    case 5:
                        tensString = "fifty";
                        break;
                    case 6:
                        tensString = "sixty";
                        break;
                    case 7:
                        tensString = "seventy";
                        break;
                    case 8:
                        tensString = "eighty";
                        break;
                    case 9:
                        tensString = "ninety";
                        break;
                    default:
                        tensString = "";
                        break;
                }

                switch (ones) {
                    case 1:
                        onesString = "one";
                        break;
                    case 2:
                        onesString = "two";
                        break;
                    case 3:
                        onesString = "three";
                        break;
                    case 4:
                        onesString = "four";
                        break;
                    case 5:
                        onesString = "five";
                        break;
                    case 6:
                        onesString = "six";
                        break;
                    case 7:
                        onesString = "seven";
                    case 8:
                        onesString = "eight";
                        break;
                    case 9:
                        onesString = "nine";
                        break;
                    default:
                        onesString = "";
                        break;
                }

                tensAndOnesString = tensString + " " + onesString;
            } else {
                switch (tensAndOnes) {
                    case 10:
                        tensAndOnesString = "ten";
                        break;
                    case 11:
                        tensAndOnesString = "eleven";
                        break;
                    case 12:
                        tensAndOnesString = "twelve";
                        break;
                    case 13:
                        tensAndOnesString = "thirteen";
                        break;
                    case 14:
                        tensAndOnesString = "fourteen";
                        break;
                    case 15:
                        tensAndOnesString = "fifteen";
                        break;
                    case 16:
                        tensAndOnesString = "sixteen";
                        break;
                    case 17:
                        tensAndOnesString = "seventeen";
                        break;
                    case 18:
                        tensAndOnesString = "eighteen";
                        break;
                    case 19:
                        tensAndOnesString = "nineteen";
                        break;
                    default:
                        tensAndOnesString = "";
                        break;
                }
            }
            System.out.println(hundredsString + " and " + tensAndOnesString);

        } else {
            System.out.println("Out of ability");
        }
    }
}