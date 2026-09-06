import java.util.Scanner;
class StrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :  ");
        int number = sc.nextInt();
        int original = number;
        int[] factorial = {
            1, 1, 2, 6, 24, 
            120, 720, 5040,40320,362880
        };
        int sum = 0;
        if ( number == 0){
            sum = factorial[0];
        }
        while ( number > 0){
            int digit = number % 10;
            sum = sum + factorial[digit];
            number = number / 10;
        }
        if ( sum == original ){
            System.out.print("Strong Number ");
        } else {
            System.out.println("Not a Strong Number ");
        }
       sc.close();
    }
}
// Time Complexity O(d)
// Space Complexity O(1)