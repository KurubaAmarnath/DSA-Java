import java.util.Scanner;
public class StringLength01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();
        int stringLength = text.length();
        System.out.println("String Length of " + text + " is : "+ stringLength);
        sc.close();
    }
}
// Time Complexity : O(1)
// Auxiliary Complexity : O(1)