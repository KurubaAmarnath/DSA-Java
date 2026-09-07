import java.util.Scanner;
class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int sum = 0;
        for ( int i = 1; i < number; i++){
            if ( number % i == 0){
                sum = sum + i;
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

// Time Complexity O(n)
// Space Complexity O(1)