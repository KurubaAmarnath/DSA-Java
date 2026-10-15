import java.util.Scanner;
public class CreateAndPrintString02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();
        System.out.println("Your String : " + text);
        sc.close();
    }
}
// Time Complexity : O(1)
// Auxiliary Complexity : O(1)
