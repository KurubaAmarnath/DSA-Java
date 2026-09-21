import java.util.Scanner;
public class GCDApproach02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number : "); 
        int a = sc.nextInt();
        System.out.print("Enter a Second Number : ");
        int b = sc.nextInt(); 
        while ( b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        } 
        System.out.println("GCD = " + a);  
        sc.close();    

    }
}

// Time Complexity : O(log(min(a,b)))
// Space Complexity : O(1)