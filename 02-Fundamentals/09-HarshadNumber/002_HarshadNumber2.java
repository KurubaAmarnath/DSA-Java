import java.util.Scanner;
class HarshNumberApproach2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int number = sc.nextInt();
        if(number <= 0){
            System.out.println("Invalid Input");
            sc.close();
            return ;
        }
        int original = number;
        int sum = 0;
        while ( number > 0){
            sum+=number%10;
            number/=10;
        }
        boolean isHarshad = original % sum == 0;
        System.out.println(isHarshad ? "Harshad Number" : "Not a HarshadNumber ");
        sc.close();
    }
}
// Time Complexity O(d)
// Space Complexity O(1)