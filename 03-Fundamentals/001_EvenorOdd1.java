import java.util.Scanner;
 class EvenorOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        if (sc.hasNextInt()){
            int number = sc.nextInt();
            if ( number % 2 == 0){
                System.out.println("The entered Number "+number +", is an  Even Number ");
            }
            else {
              System.out.println("The entered Number "+number +", is an Odd NUmber ");  
            }
        }
        else {
            System.out.println("Enter a Valid Number to Check even or Odd ");
         }

    sc.close(); 
    }
}
// Time Complexity : O(1)
// Space Complexity : O(1)