import java.util.Scanner;
public class MinimumElement01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements");
        for ( int i = 0; i<numbers.length;i++){
            numbers[i] = sc.nextInt();

        }
        int minElement = numbers[0];
        for ( int i = 1; i<numbers.length; i++){
            if ( numbers[i]<minElement){
                minElement = numbers[i];
            }
        }
        System.out.println("The Minimum Element :  " + minElement);
        sc.close();
    }  
}

// Time Complexity : O(n)
// Space Complexity : O(n)

