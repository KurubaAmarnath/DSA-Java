import java.util.Scanner;
public class CharacterAtIndex02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();
        for ( int i = 0; i<text.length();i++){
            System.out.println("Index " + i + " : " + text.charAt(i));
        }
        
        sc.close();
    }
}
// Time Complexity : O(n)
// Auxiliary Complexity : O(1)
