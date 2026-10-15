import java.util.Scanner;
import java.util.Arrays;
public class InsertElement02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int value = sc.nextInt();
        System.out.print("Enter index (0 to " + n + "): ");
        int index = sc.nextInt();
        if (index < 0 || index > n) {
            System.out.println("Invalid index");
        } else {
            int[] result = new int[n + 1];
            for (int i = 0; i < index; i++) {
                result[i] = numbers[i];
            }
            result[index] = value;
            for (int i = index; i < n; i++) {
                result[i + 1] = numbers[i];
            }
            System.out.println("Array after insertion: "
                    + Arrays.toString(result));
        }
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n) 