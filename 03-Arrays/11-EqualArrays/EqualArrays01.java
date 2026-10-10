import java.util.Scanner;
public class EqualArrays01{
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
        boolean equal = true;
        if(n1!=n2){
            equal = false;
        } else {
            for ( int i = 0; i< n1; i++){
                if( nums1[i] != nums2[i] ){
                    equal = false;
                    break;
                }
            }
        }
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
