import java.util.Arrays;
import java.util.Scanner;
public class CopyAnArray02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n  + " Elements : ");
        for ( int i = 0; i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] copy = Arrays.copyOf(nums, nums.length);
        System.out.println("Original Array : " + Arrays.toString(nums));
        System.out.println("Copied Array : " + Arrays.toString(copy));
        sc.close();
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n) 

