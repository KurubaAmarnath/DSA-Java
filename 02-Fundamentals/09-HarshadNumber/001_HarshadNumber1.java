import java.util.Scanner;
class HarshNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        if( number <= 0){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int original = number;
        int sum = 0;
        while ( number > 0){
            int digit = number % 10;
            sum = sum+digit;
            number = number / 10;
        }
        if ( original % sum == 0){
            System.out.println("Harshad Number");
        }else {
            System.out.println("Not a Harshad Number");
        }
        sc.close();
    }
}
// Time Complexity O(d)
// Space Complexity O(1)