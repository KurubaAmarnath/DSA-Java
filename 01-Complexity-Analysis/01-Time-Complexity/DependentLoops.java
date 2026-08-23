public class DependentLoops {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.println(i + " " + j);
            }
        }

        /*
         * The inner loop depends on the value of i.
         *
         * Number of operations:
         *
         * 0 + 1 + 2 + 3 + ... + (n - 1)
         *
         * This is:
         *
         * n(n - 1) / 2
         *
         * After removing constants and lower-order terms:
         *
         * Time Complexity: O(n²)
         * Space Complexity: O(1)
         */
    }
}