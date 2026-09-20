import java.util.Scanner;
class PrimeFactorization02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.print("Prime Factors :  " );
        for ( int i =2; i<=n/i; i++){
            while ( n % i == 0 ){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if ( n > 1){
            System.out.print(n);
        }
        sc.close();
    }
}

// Time Complexity : O(√n)
// Space Complexity : O(1)