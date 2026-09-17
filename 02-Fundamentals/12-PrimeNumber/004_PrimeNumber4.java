import java.util.Scanner;
class ResuableMethod{
     static boolean isPrime(int number){
        if ( number <= 1){
            return false;
     }
      if ( number == 2 ){
        return true;
      }
      if ( number % 2 == 0){
        return false;
      }
      for ( int i = 3; i<=number/i; i+=2){
        if ( number % i == 0){
            return false;
        }
      }
      return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        if(isPrime(number)){
            System.out.println("Prime Number ");
        } else {
            System.out.println("Not a Prime Number");
        }
        sc.close();

    }
}
// Time Complexity : O(√n)
// Space Complexity : O(1)