import java.util.Scanner;
public class Factorial02{
    static long factorial( int n){
        if ( n == 0){
            return 1;
        }
        return n * factorial( n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        if( n < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else {
        System.out.println("Factorial = " + factorial(n));  
        }  
        sc.close();    
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)