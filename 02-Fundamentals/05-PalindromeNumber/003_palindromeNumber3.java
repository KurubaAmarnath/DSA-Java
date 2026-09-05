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

        String number = String.valueOf(n);

        int left = 0;
        int right = number.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            if (number.charAt(left) != number.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
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
// Space Complexity : O(d)