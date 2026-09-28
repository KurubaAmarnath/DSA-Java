import java.util.Scanner;
public class TrailingZeros01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        long factorial = 1;
        for ( int i = 1; i <=n; i++){
            factorial*=i;
        }
        System.out.println("Factorial is : " + factorial);
        int count = 0;
        while ( factorial % 10 == 0){
            count++;
            factorial/=10;
        }
        System.out.println("Trailing Zeros : " + count);
        sc.close();

    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)