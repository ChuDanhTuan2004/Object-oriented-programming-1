import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create two arrays with given size
        System.out.print("Enter the size of array 1: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of array 1:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array 2: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of array 2:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        // Step 3: Create a third array with size of array1 + array2
        int[] array3 = new int[n1 + n2];

        // Step 4: Copy elements from array1 to array3
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }

        // Step 5: Copy elements from array2 to array3
        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }

        // Step 6: Print the merged array
        System.out.println("Merged array:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
