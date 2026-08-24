public class TwoDifferentInputs {

    public static void main(String[] args) {

        int[] first = {10, 20, 30, 40, 50};

        int[] second = {100, 200, 300};

        int n = first.length;
        int m = second.length;

        for (int i = 0; i < n; i++) {

            System.out.println(first[i]);
        }

        for (int j = 0; j < m; j++) {

            System.out.println(second[j]);
        }

        /*
         * First loop:
         * O(n)
         *
         * Second loop:
         * O(m)
         *
         * The input sizes are different.
         *
         * Therefore:
         *
         * O(n) + O(m)
         * = O(n + m)
         *
         * Time Complexity: O(n + m)
         * Space Complexity: O(1)
         */
    }
}