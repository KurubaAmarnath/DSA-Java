import java.util.Scanner;
public class FactorialFormula01{
    static long factorial(int n){
        long result = 1;
        for ( int i = 1; i<=n; i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        if (r < 0 || r > n){
            System.out.println("Invalid Input");
        }else {
            long result = factorial(n)/(factorial(r)*factorial(n-r));
            System.out.println("nCr : " + result);
        }
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
