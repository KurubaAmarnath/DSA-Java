import java.util.*;
public class Fibonacci02{
    static long fibonacci(int n){
        if ( n == 0){
            return 0;
        }
        if ( n == 1 ){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter Number of terms : ");
        int n = sc.nextInt();
        for ( int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");

        }
        sc.close();

    }
}

// Time Complexity : O( 2^n )
// Space Complexity : O(n)