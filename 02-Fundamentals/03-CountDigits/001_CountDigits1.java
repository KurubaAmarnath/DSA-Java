import java.util.*;
class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int integer = sc.nextInt();
        integer=Math.abs(integer);
        int count;
        if(integer ==0){
            count=1;
        }
        else {
            count = (int)Math.log10(integer)+1;
        }
        System.out.println("Number of Digits: " + count);
        sc.close();
    }
}

// Time Complexity : O(1)
// Space Complexity : O(1)