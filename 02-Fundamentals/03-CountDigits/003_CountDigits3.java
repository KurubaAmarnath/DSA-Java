import java.util.Scanner;

class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        String number = String.valueOf(Math.abs(n));

        System.out.println("Number of digits: " + number.length());

        sc.close();
    }
}
//( d is the number of Digits )
//Time Complexity O(d) 
//Space Complexity O(d)