import java.util.Scanner;
class EvenorOdd2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        if ( sc.hasNextInt()){
            int number = sc.nextInt();
            if (( number & 1)==0 ){
                System.out.println(number + " is Even Number ");
            } else {
                System.out.println(number + " is Odd Number ");
            }
        }
        else {
            System.out.println("Enter Valid Number to Check even or Odd ");
        }
        sc.close();
    }
}

// Time Complexity: O(1)
//Space Complexity: O(1)