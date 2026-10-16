import java.util.Scanner;
public class StringLength02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();
        int count = 0;
        for ( int i = 0; i<text.length();i++){
            count++;
        }
        System.out.println("String Length : " + count);
        sc.close();
    }
}

// Time Complexity : O(1)
// Auxiliary Complexity : O(1)