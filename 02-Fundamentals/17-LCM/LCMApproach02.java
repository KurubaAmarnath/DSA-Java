import java.util.Scanner;
public class LCMApproach02{
    static int gcd(int a , int b){
        while ( b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    static int lcm( int a , int b){
        return Math.abs((a / gcd(a, b))*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("LCM = " + lcm(a, b));
        sc.close();
    }
}

// Time Complexity : O(log(min(a,b)))
// Space Complexity : O(1)