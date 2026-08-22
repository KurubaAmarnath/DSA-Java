public class LinearTime {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }

        /*
         * The loop visits every element once.
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */
    }
}