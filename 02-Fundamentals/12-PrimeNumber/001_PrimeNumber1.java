import java.util.Scanner;
class PrimeNumner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        if ( number <= 1){
           System.out.println("Not a Prime Number");
           sc.close();
           return;
        }
        boolean isPrime = true;
        for ( int i = 2; i < number; i++){
            if ( number % i ==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime");
        }
        sc.close();
    }
}
//Time Complexity : O(n) { Worst Case for a prime Number like 997..}
//Space Complexity : O(1)