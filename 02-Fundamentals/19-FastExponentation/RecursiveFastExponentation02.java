import java.util.Scanner;
public class RecursiveFastExponentation02{
    static long power(long base , int exponent){
        if ( exponent == 0){
            return 1;
        }
        long half = power(base, exponent/2); 
        if ( exponent % 2 == 0){
            return half * half;
        }
        return  base * half * half;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter base : ");
        long base = sc.nextLong();
        System.out.print("Enter exponent : " );
        int exponent = sc.nextInt();
        System.out.println("Result = " + power(base, exponent));
        sc.close();

    }
}


//Time Complexity : O(log n)
//Space Complexity : O(log n)