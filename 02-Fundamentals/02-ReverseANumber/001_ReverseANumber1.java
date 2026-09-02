import java.util.Scanner;
class ReverseANumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int original = number;
        int reverse = 0;
        number = Math.abs(number);
        while(number>0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }
        if ( original<0){
            reverse = -reverse;
        }
        System.out.println("Reversed Number: " + reverse);
        sc.close();
    }
}
//Time Complexity O(logn)
//Space Complexity O(1)