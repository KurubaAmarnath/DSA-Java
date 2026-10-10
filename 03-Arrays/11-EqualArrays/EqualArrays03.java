import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays03 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of first array: ");
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];

    System.out.println("Enter first array elements:");
    for (int i = 0; i < n1; i++) {
        arr1[i] = sc.nextInt();
    }

    System.out.print("Enter size of second array: ");
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];

    System.out.println("Enter second array elements:");
    for (int i = 0; i < n2; i++) {
        arr2[i] = sc.nextInt();
    }

    if (n1 != n2) {
        System.out.println("Arrays are not equal");
    } else {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    sc.close();
}

}
// Time Complexity : O(n log n)
// Space Complexity : O(n)