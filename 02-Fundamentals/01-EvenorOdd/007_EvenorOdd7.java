import java.util.Scanner;
 class EvenorOdd7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        // Right shift by 1 and left shift by 1
        // If both are equal, the number is even.
        if ((n >> 1) << 1 == n) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        sc.close();
    }
}