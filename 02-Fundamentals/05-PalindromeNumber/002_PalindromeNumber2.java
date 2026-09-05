import java.util.Scanner;

 class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a Palindrome");
            sc.close();
            return;
        }

        if (n < 10) {
            System.out.println("Palindrome");
            sc.close();
            return;
        }

        int divisor = 1;
        int temp = n;

        // Finding the highest power of 10
        while (temp >= 10) {
            divisor *= 10;
            temp /= 10;
        }

        boolean palindrome = true;

        while (n > 0) {

            int firstDigit = n / divisor;
            int lastDigit = n % 10;

            if (firstDigit != lastDigit) {
                palindrome = false;
                break;
            }

            // Removing first digit
            n = n % divisor;

            // Removing last digit
            n = n / 10;

            divisor /= 100;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
// Time Complexity : O(d)
// Space Complexity : O(1)