import java.util.Scanner;
public class TrailingZeros02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int count = 0;
        while ( n >=5){
            n/=5;
            count+=n;
        }
        System.out.println("Trailing Zeros : " + count);
        sc.close();
    }
}  

// Time Complexity : O(log₅ n)
// Space Complexity : O(1)