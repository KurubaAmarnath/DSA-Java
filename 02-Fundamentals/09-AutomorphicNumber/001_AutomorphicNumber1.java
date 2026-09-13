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
        int original = n;
        int digits = 0;
        int temp = n;
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }
        }
        int power = 1;
        for (int i = 1; i <= digits; i++) {
            power = power * 10;
        }
        int square = n * n;
        if (square % power == original) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
        sc.close();
    }
}
// Time Complexity O(d)
// Space Complexity O(1)