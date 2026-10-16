import java.util.Scanner;
public class Uppercase01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String text = sc.nextLine();
        String result = text.toUpperCase();
        System.out.println("Uppercase : " + result);
        sc.close();
    }
}
// Time Complexity : O(n)
// Auxiliary Complexity : O(n)