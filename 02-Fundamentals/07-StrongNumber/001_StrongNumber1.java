import java.util.Scanner;
class StrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;
        while ( number > 0){
            int digit = number%10;
            int fact =1;
            for(int i = 1; i<=digit;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            number = number/10;
        }
        if ( sum == original ){
            System.out.println("Strong Number ");
        } else{
            System.out.println("Not a Strong Number ");
        }
       sc.close();
    }
}

// Time Complexity O(d)
// Space Complexity O(1)