import java.util.Scanner;
public class ReverseAnArray02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n  + " Elements : ");
        for ( int i = 0; i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] reversed = new int[n];
        for ( int i = 0; i<nums.length;i++){
            reversed[i] = nums[nums.length - 1 - i];
        }
         System.out.println("Reversed Array : ");
         for ( int i = 0; i< nums.length;i++){
         System.out.print(nums[i] + " ");
         }
         sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)    
