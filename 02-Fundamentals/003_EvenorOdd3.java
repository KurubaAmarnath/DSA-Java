
import java.util.Scanner;
class EvenorOdd3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            int quotient = number / 2;
            if(quotient * 2 == number ){
                System.out.println(number + " is Even Number ");
            } else {
                System.out.println(number + " is Odd Number ");
            }
        } else {
            System.out.println("Invalid Input ");
        }
        sc.close();
    }
}
// Time Complexity: O(1)
//Space Complexity: O(1)
