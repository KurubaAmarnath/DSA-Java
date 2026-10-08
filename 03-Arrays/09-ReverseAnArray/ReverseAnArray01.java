import java.util.Scanner;
public class ReverseAnArray01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n  + " Elements : ");
        for ( int i = 0; i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int left = 0;
        int right = nums.length-1;
        while(left  < right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array : ");
        for ( int i = 0; i< nums.length;i++){
        System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)