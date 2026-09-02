import java.util.Scanner;

 class EvenorOdd8 {

    static boolean isEven(int num) {
        num = Math.abs(num);

        if (num == 0) {
            return true;
        }

        if (num == 1) {
            return false;
        }

        return isEven(num - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (isEven(num)) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        } else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}