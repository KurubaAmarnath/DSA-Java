import java.util.Scanner;

 class EvenorOdd5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            String[] result = {"Even", "Odd"};

            System.out.println(num + " is " + result[Math.abs(num % 2)]);
        } else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
// Time Complexity: O(1)
//Space Complexity: O(1)