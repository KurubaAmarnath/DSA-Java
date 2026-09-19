import java.util.Scanner;
public class FindFactors01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        for ( int i = 1; i <= number; i++){
            if ( number % i == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();

    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)