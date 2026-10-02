import java.util.Scanner;
public class MaximumElement02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            maximum = Math.max(maximum, numbers[i]);
        }
        System.out.println("Maximum element: " + maximum);
        sc.close();
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n)

