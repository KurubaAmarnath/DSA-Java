import java.util.Scanner;
public class MultiplicationFormula02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        if ( r < 0 || r > n){
            System.out.println("Invalid Input");
        } else {
            r = Math.min(r , n - r);
            long result = 1;
            for ( int i = 1; i<=r; i++){
                result = result * (n-r + i)/i;
            }
            System.out.println("nCr : " + result);
        }
        sc.close();
    }
}

// Time Complexity : O(min(r,n-r))
// Space Complexity : O(1)