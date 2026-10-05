import java.util.Scanner;
public class AverageOfArray02{
    static int findSum(int[] numbers,int index){
        if( index == numbers.length){
            return 0;
        }
        return  numbers[index]+findSum(numbers, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements");
        for ( int i = 0; i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        int sum = findSum(numbers, 0);
        double average = (double)sum / numbers.length;

        System.out.println("Average : " + average);
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)