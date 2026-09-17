import java.util.Scanner;
class SkipEvenDivisors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        if ( number <= 1){
            System.out.println("Not a Prime Number");
            sc.close();
            return ;
        }
        if ( number == 2 ){
            System.out.println("Prime Number");
            sc.close();
            return;
        }
        if ( number % 2 == 0){
            System.out.println("Not a Prime Number");
            sc.close();
            return ;
        }
        boolean isPrime = true;
        for ( int i = 3; i <= number / i; i+=2){
            if ( number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number ");
        }
        sc.close();
    }
}
// Time Complexity : O(√n)
// Space Complexity : O(1)
