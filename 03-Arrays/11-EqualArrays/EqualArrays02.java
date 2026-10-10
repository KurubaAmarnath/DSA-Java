import java.util.Scanner;
import java.util.Arrays;
public class EqualArrays02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Array Size : ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter " + n1  + " Elements : ");
        for ( int i = 0; i<nums1.length;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.print("Enter Second Array Size : ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter " + n2  + " Elements : ");
        for ( int i = 0; i<nums2.length;i++){
            nums2[i]=sc.nextInt();
        }
        boolean equal = Arrays.equals(nums1,nums2);
        if( equal){
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays Not Equal");
        }
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n) 
