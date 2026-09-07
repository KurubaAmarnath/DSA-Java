import java.util.Scanner;

 class PerfectNumber {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int number = sc.nextInt();
    int sum = 1;
    for( int i = 2; i<=number/i; i++){
        if ( number % i == 0){
            sum = sum+i;
            int pair = number/i;
            if( pair != i){
                sum = sum+pair;
            }
        }
    }
        if ( sum == number){
          System.out.println("Perfect Number");
        } else{
            System.out.println("Not a Perfect Number");
        }
        sc.close();
    }
}

// Time Complexity O(√n)
// Space Complexity O(1)
