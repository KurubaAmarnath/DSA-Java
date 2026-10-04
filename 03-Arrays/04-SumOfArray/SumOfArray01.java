import java.util.Scanner;
public class SumOfArray01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements");
        for ( int i = 0; i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for ( int j = 0; j<numbers.length;j++){
            sum+=numbers[j];
        }
        System.out.println("Sum of Array is : " + sum);
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)