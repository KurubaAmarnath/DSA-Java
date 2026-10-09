import java.util.Scanner;
public class CopyAnArray01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n  + " Elements : ");
        for ( int i = 0; i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] copy = new int[n];
        for ( int i = 0; i < n; i++){
            copy[i]=nums[i];

        }
        System.out.println("Original Array");
        for ( int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nCopied Array");
        for ( int i = 0; i<n;i++){
            System.out.print(copy[i] + " ");
        }
        sc.close();
    }
}


// Time Complexity : O(n)
// Space Complexity : O(n)  