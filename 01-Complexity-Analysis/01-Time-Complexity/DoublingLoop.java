public class DoublingLoop {

    public static void main(String[] args) {

        int n = 1;

        while (n < 100) {

            System.out.println(n);

            n = n * 2;
        }

        /*
         * The value of n is doubled after every iteration.
         *
         * Example:
         *
         * 1 → 2 → 4 → 8 → 16 → 32 → 64
         *
         * The number of iterations grows logarithmically.
         *
         * Time Complexity: O(log n)
         * Space Complexity: O(1)
         */
    }
}