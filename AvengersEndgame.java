import java.util.Scanner;

public class ReadPrintArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Read array elements
        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array elements are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
