import java.util.Scanner;

 class PalindromeNumber1 {

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

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}

//Time Complexity O(logn)
// Space Complexity O(1)