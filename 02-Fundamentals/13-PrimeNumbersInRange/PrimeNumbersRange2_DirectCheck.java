import java.util.Scanner;
class PrimeNumbersRangeApproch2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start : ");
        int start = sc.nextInt();
        System.out.print("Enter end : ");
        int end = sc.nextInt();
        for ( int n = start; n <=end; n++){
            if ( n < 2){
                continue;
            }
            boolean isPrime = true;
            for ( int i = 2; i <=n/i; i++){
                if ( n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}

// Time Complexity : O(end - start+1)x√end)
// Space Complexity : O(1)