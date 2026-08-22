public class ConstantTime {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[2]);

        /*
         * Array access takes the same amount of time
         * regardless of the array size.
         *
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         */
    }
}