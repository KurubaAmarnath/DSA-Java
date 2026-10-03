import java.util.Arrays;
import java.util.Scanner;
public class MinimumElement03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int minimum = numbers[0];
        System.out.println("Minimum element: " + minimum);
        scanner.close();
    }
}
// Time Complexity : O(n log n)
// Space Complexity : O(n)