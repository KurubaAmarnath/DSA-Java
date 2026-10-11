import java.util.Scanner;
public class CheckSortedArray01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[i - 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
        sc.close();
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n) 