import java.util.Scanner;
public class CountEvenorOdd02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements");
        for ( int i = 0; i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for ( int j = 0; j<numbers.length;j++){
            if ( (numbers[j]&1)==0){
                evenCount++;
            } else {
                oddCount++;
            }

        }
        System.out.println("Even Count : " + evenCount);
        System.out.println("Odd count : " + oddCount);
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)