import java.util.Scanner;
public class UpperCase02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text =  sc.nextLine();
        StringBuilder result = new StringBuilder();
        for ( int i = 0; i<text.length();i++){
            char ch = text.charAt(i);
            result.append(Character.toUpperCase(ch));
        }
        System.out.println("Uppercase : " + result);
        sc.close();
    }
}

// Time Complexity : O(n)
// Auxiliary Space : O(n)