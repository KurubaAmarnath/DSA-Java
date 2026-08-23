public class LinearithmicTime {

    static void process(int[] numbers) {

        int n = numbers.length;

        int size = n;

        while (size > 1) {

            for (int i = 0; i < n; i++) {
                // Linear work
            }

            size /= 2;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        process(numbers);

      

        /*

         * The while loop divides the problem size by 2.
         *
         * Number of iterations:
         *
         * O(log n)
         *
         * The for loop runs n times
         * during each iteration.
         *
         * Work at each level:
         *
         * O(n)
         *
         * Total:
         *
         * O(n) × O(log n)
         *
         * = O(n log n)
         *
         * Time Complexity: O(n log n)
         * Space Complexity: O(1)
         */
    }
}