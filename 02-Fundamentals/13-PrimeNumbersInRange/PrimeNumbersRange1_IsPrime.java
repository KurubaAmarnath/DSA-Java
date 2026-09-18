import java.util.Scanner;
class PrimeNumbersRangeApproch1{
    static boolean isPrime(int number){
        if ( number < 2){
            return false;
        }
        for ( int i = 2; i <=number/i; i++){
            if ( number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start : ");
        int start = sc.nextInt();
        System.out.print("Enter end : ");
        int end = sc.nextInt();
        for ( int i = start ; i <=end; i++){
            if ( isPrime(i)){
                System.out.print(i + " " );
            }
        }
        sc.close(); 
    }
}

// Time Complexity : O(end - start+1)x√end)
// Space Complexity : O(1)