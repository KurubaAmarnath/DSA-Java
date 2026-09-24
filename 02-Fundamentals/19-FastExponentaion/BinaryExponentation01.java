import java.util.Scanner;
public class BinaryExponentation01{
    static long power(long base, int exponent){
        long result = 1;
        while ( exponent > 0){
            if ( exponent % 2 == 1){
                result = result * base ;
            }
            base = base * base;
            exponent = exponent / 2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        long base = sc.nextLong();
        System.out.print("Enter exponent : " );
        int exponent = sc.nextInt();
        System.out.println("Result = " + power(base, exponent));
        sc.close();

    }
}

//Time Complexity : O(log n)
//Space Complexity : O(1)