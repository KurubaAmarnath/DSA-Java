import java.util.Scanner;
class FactorPairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        for ( int i=1; i <=number/i; i++){
            if(number % i ==0){
                System.out.print(i + " ");
            if( i != number /i){
                System.out.print(number/i + " ");
            }
            }
        }
        sc.close();
    }
}
// Time Complexity : O(√n)
// Space Complexity : O(1)