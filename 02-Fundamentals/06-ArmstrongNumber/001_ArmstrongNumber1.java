import java.util.Scanner;

class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Enter a non-negative number.");
                sc.close();
                return;
            }

            int original = num;
            int temp = num;
            int digits = 0;
            int sum = 0;

            // Counting digits
            if (temp == 0) {
                digits = 1;
            } else {
                while (temp > 0) {
                    digits++;
                    temp /= 10;
                }
            }

            // Calculating Armstrong sum
            temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is not an Armstrong number.");
            }

            sc.close();
        }
    }

// Time Complexity : O(d)
// Space Complexity : O(1)

