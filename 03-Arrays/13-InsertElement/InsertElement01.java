import java.util.Scanner;
public class InsertElement01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n + 1];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int value = scanner.nextInt();
        System.out.print("Enter index (0 to " + n + "): ");
        int index = scanner.nextInt();
        if (index < 0 || index > n) {
            System.out.println("Invalid index");
        } else {
            for (int i = n; i > index; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[index] = value;
            System.out.println("Array after insertion:");
            for (int i = 0; i < n + 1; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
        scanner.close();
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n) 