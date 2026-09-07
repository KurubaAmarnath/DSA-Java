import java.util.Scanner;
 class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        long sumOfDivisors = 1;
        for (int p = 2; p <= temp / p; p++) {
            if (temp % p == 0) {
                long term = 1;
                long power = 1;
                while (temp % p == 0) {
                    temp = temp / p;
                    power = power * p;
                    term = term + power;
                }
                sumOfDivisors = sumOfDivisors * term;
            }
        }
        if (temp > 1) {
            sumOfDivisors = sumOfDivisors * (1 + temp);
        }
        if (sumOfDivisors == 2L * n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
        sc.close();
    }
}
// Time Complexity O(√n)
// Space Complexity O(1)