import java.util.Arrays;
import java.util.Scanner;
public class MaximumElement03 {
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
        int maximum = numbers[numbers.length - 1];
        System.out.println("Maximum element: " + maximum);
        scanner.close();
    }
}
// Time Complexity : O(n log n)
// Space Complexity : O(n)