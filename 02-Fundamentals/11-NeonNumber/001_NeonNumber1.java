import java.util.Scanner;
 class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }
        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
        sc.close();
    }
}
// Time Complexity O(d)
// Space Complexity O(1)