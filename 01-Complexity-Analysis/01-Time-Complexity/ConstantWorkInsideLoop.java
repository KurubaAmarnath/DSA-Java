public class ConstantWorkInsideLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

            System.out.println("Current sum: " + sum);
        }

        /*
         * The loop runs n times.
         *
         * Inside the loop, only constant work
         * is performed.
         *
         * Each iteration:
         * O(1)
         *
         * Number of iterations:
         * n
         *
         * Total:
         *
         * O(n) × O(1)
         * = O(n)
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */
    }
}