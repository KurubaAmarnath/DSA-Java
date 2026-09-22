import java.util.Scanner;
public class LCMApproach01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int start = Math.max(a, b);
        while(true){
            if ( start % a == 0 && start % b == 0){
                System.out.println("LCM = " + start);
                break;
            }
            start++;
        }
        sc.close(); 
    }
}

// Time Complexity O(a x b) [WorstCase]
// Space Complexity O(1)