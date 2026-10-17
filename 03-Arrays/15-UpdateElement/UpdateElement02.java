import java.util.Arrays;
import java.util.Scanner;
public class UpdateElement02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        System.out.print("Enter target value : ");
        int target=sc.nextInt();
        System.out.print("Enter new value : ");
        int newValue = sc.nextInt();
        for ( int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                arr[i]=newValue;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
