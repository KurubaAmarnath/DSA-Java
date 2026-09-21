import java.util.Scanner;
public class GCDApproach01{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a First Number : "); 
       int a = sc.nextInt();
       System.out.print("Enter a Second Number : ");
       int b = sc.nextInt();
       int gcd = 1;
       int limit = Math.min(a,b);
       for ( int i = 1; i<=limit; i++){
        if ( a % i == 0 && b % i == 0){
            gcd = i;
        }
       }
       System.out.println("GCD = " + gcd);
       sc.close();
    }
}

// Time Complexity : O(min(a,b))
// Space Complexity : O(1)
    

