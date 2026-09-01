import java.util.Scanner;
class EvenorOdd4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        if ( sc.hasNextInt()){
            int number = sc.nextInt();
            String result = ( number %2 == 0) ? "Even" : "Odd";
            System.out.println(number + " is " + result);
        } else {
            System.out.println("Invalid Input ");
        }
        sc.close();
    }
}
// Time Complexity: O(1)
//Space Complexity: O(1)