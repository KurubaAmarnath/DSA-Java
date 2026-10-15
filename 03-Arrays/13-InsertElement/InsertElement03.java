import java.util.ArrayList;
import java.util.Scanner;
public class InsertElement03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.print("Enter element to insert: ");
        int value = sc.nextInt();
        System.out.print("Enter index (0 to " + n + "): ");
        int index = sc.nextInt();
        if (index < 0 || index > numbers.size()) {
            System.out.println("Invalid index");
        } else {
            numbers.add(index, value);

            System.out.println("Array after insertion: " + numbers);
        }
        sc.close();
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n) 