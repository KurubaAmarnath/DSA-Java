import java.util.*;
class SumofDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int number = sc.nextInt();
        number = Math.abs(number);
        int sum = 0;
        while(number>0){
            int digit = number%10;
            sum = sum+digit;
            number = number/10;
        }
        System.out.println("Sum of Digits : "+ sum);
        sc.close();
    }
}

//Time Complexity O(logn)
// Space Complexity O(1)