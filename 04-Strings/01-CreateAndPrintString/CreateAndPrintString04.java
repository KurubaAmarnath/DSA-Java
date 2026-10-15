import java.util.Scanner;
public class CreateAndPrintString04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();
        for ( int i = 0; i < text.length();i++){
            System.out.print(text.charAt(i));

        }
        System.out.println();
        sc.close();
    }
}
// Time Complexity : O(n)
// Auxiliary Complexity : O(1)