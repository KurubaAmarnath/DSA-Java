import java.util.Scanner;
class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int integer = sc.nextInt();
        integer = Math.abs(integer);
        int count = 0;
        if(integer ==0){
            count =1;
        }else{
            while(integer >0){
                integer/=10;
                count++;
            }
        }
        System.out.println("Number of Digits : " + count);
        sc.close();
    }
}
//Time Complexity O(logn)
//Space Complexity O(1)