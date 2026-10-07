import java.util.Scanner;
public class LinearSearch01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements");
        for ( int i = 0; i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter element to search : ");
        int target = sc.nextInt();
        int index = -1;
        for ( int i = 0; i<numbers.length; i++){
            if( numbers[i]==target){
                index = i;
                break;
            }
        }
        if( index!=-1){
            System.out.println("Element found at index : " + index);
        }else{
            System.out.println("Elemnt not found");
        }
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)