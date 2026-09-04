import java.util.Scanner;
class SumofDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an Integer : ");
        int n = sc.nextInt();
        String number = String.valueOf(Math.abs(n));
        int sum = 0;
        for ( int i = 0;  i <number.length(); i++){
            int digit = number.charAt(i)-'0';
            sum+=digit;
        }
        System.out.println("Sum of Digits : " + sum);
        sc.close();
    }  
}

// Time Complexity : O(d)
// Space Complexity : O(d)