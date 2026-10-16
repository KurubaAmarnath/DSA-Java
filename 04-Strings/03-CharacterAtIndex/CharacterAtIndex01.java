import java.util.Scanner;
public class CharacterAtIndex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();
        System.out.print("Enter index : ");
        int index = sc.nextInt();
        if ( index >=0 && index <text.length()){
            System.out.println("Character  at index " + index  + " : " + text.charAt(index));
        } else {
            System.out.println("Invalid Index");
        }
        sc.close();
    }
}
// Time Complexity : O(1)
// Auxiliary Complexity : O(1)
