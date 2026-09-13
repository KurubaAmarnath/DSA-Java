import java.util.Scanner;

class AutomorphicNumber {
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
        boolean isAutomorphic = true;
        while (n > 0) {
            int digitOfNumber = n % 10;
            int digitOfSquare = square % 10;

            if (digitOfNumber != digitOfSquare) {
                isAutomorphic = false;
                break;
            }
            n = n / 10;
            square = square / 10;
        }
        if (isAutomorphic) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
        sc.close();
    }
}

// Time Complexity O(d)
// Space Complexity O(1)