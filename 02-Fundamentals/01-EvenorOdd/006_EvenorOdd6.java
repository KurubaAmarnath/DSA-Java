import java.util.Scanner;

class EvenorOdd6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            switch (Math.abs(num % 2)) {
                case 0:
                    System.out.println(num + " is Even");
                    break;

                case 1:
                    System.out.println(num + " is Odd");
                    break;
            }
        } else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
// Time Complexity: O(1)
//Space Complexity: O(1)