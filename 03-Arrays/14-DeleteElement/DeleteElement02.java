import java.util.Scanner;
public class DeleteElement02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        int index=-1;
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to delete : ");
        int target = sc.nextInt();
        for ( int i =0;i<n;i++){
            if(arr[i]==target){
                index=i;
                break; 
            }
        }
        if(index==-1){
            System.out.println("Element not found ");
        } else {
            for ( int i = index; i<n-1;i++){
                arr[i]=arr[i+1];
            }
            n--;
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

// Time Complexity : O(n)
// Extra Space : O(1)