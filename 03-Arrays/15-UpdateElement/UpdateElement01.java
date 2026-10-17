import java.util.Scanner;
import java.util.Arrays;
public class UpdateElement01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10,20,30,40,50};
        System.out.print("Enter Index : ");
        int index = sc.nextInt();
        System.out.print("Enter New Value : ");
        int value = sc.nextInt();
        if ( index >=0 && index < arr.length){
            arr[index]=value;
            System.out.println(Arrays.toString(arr));
        }
        else{
            System.out.println("Invalid Index");
        }
        sc.close();
    }
}

// Time Complexity : O(1)
// Auxiliary Complexity : O(1)