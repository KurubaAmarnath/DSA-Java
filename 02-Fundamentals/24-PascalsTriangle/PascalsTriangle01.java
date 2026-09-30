import java.util.Scanner;
public class PascalsTriangle01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :  ");
        int n = sc.nextInt();
        for ( int row = 0; row<n; row++){
            for ( int space =0; space <n-row-1;space++){
                System.out.print(" ");
            }
            long value = 1;
            for ( int col = 0; col<=row; col++){
                System.out.print(value + " ");
                value = value * ( row - col)/(col + 1);

            }
            System.out.println();
        }
        sc.close();  
    }
}

// Time Complexity : O(n²)
//Space Complexity : O(1)