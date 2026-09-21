import java.util.Scanner;
public class GCDApproach03{
     static int gcd( int a , int b){
        while ( b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number : "); 
        int a = sc.nextInt();
        System.out.print("Enter a Second Number : ");
        int b = sc.nextInt();
        System.out.println("GCD = " + gcd(a,b)); 
        sc.close();       
    }
}

// Time Complexity : O(log(min(a,b)))
// Space Complexity : O(1)