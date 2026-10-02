import java.util.Scanner;
public class MaximumElement01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements");
        for ( int i = 0; i<numbers.length;i++){
            numbers[i] = sc.nextInt();

        }
        int maxElement = numbers[0];
        for ( int i = 1; i<numbers.length; i++){
            if ( numbers[i]>maxElement){
                maxElement = numbers[i];
            }
        }
        System.out.println("The Maximum Element :  " + maxElement);
        sc.close();
    }  
}

// Time Complexity : O(n)
// Space Complexity : O(n)

