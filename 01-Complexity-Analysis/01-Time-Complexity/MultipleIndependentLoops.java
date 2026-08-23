public class MultipleIndependentLoops {

    public static void main(String[] args) {

        int n = 5;
        int m = 3;

        // First loop
        for (int i = 0; i < n; i++) {

            System.out.println("First Loop: " + i);
        }

        // Second loop
        for (int j = 0; j < m; j++) {

            System.out.println("Second Loop: " + j);
        }

        /*
         * The loops are independent of each other.
         *
         * First loop runs n times:
         * O(n)
         *
         * Second loop runs m times:
         * O(m)
         *
         * Since the loops are sequential:
         *
         * O(n) + O(m)
         *
         * We cannot simplify this to O(n)
         * because n and m are different input sizes.
         *
         * Time Complexity: O(n + m)
         * Space Complexity: O(1)
         */
    }
}