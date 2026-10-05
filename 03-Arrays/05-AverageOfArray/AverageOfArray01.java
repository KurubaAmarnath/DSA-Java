import java.util.Scanner;
public class AverageOfArray01{
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
        double average =  (double)sum / numbers.length;
        System.out.println("Average of Array is : " + average);
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)