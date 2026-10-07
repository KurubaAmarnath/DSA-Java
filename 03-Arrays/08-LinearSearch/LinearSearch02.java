import java.util.Scanner;
public class LinearSearch02{
    static int search(int[] numbers,int target, int index){
        if ( index == numbers.length){
            return -1;
        }
        if (  numbers[index] == target){
            return index;
        }
        return search(numbers,target,index+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements");
        for ( int i = 0; i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter element to search : ");
        int target = sc.nextInt();
        int index = search(numbers, target, 0);

        if( index!=-1){
            System.out.println("Element found at index : " + index);
        }else{
            System.out.println("Elemnt not found");
        }
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n) recursion stack.