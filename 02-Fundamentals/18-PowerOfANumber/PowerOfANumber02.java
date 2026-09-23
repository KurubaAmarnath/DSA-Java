import java.util.Scanner;
public class PowerOfANumber02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter exponent : ");
        int exponent = sc.nextInt();
        int result = 1;
        while ( exponent > 0){
            result = result * base;
            exponent--;
        }
        System.out.println("Result = " + result);
        sc.close();
    }
} 


// Time Complexity : O(exponent)
// space Complexity : O(1) 