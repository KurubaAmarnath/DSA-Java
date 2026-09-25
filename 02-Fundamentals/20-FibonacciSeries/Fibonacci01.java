import java.util.Scanner;
class Fibonacci01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of terms : ");
        int n = sc.nextInt();
        long first = 0;
        long second = 1;
        for ( int i = 1; i <= n; i++){
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)