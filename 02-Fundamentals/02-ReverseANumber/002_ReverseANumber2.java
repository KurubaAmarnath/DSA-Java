import java.util.Scanner;

 class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        boolean negative = n < 0;
        n = Math.abs(n);

        int digits = 0;
        int temp = n;

        // Count digits
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }

        int reverse = 0;
        int place = (int) Math.pow(10, digits - 1);

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse + digit * place;

            n = n / 10;
            place = place / 10;
        }

        if (negative) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}