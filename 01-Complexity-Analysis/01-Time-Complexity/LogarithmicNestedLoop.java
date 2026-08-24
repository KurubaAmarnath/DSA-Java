public class LogarithmicNestedLoop {

    public static void main(String[] args) {

        int n = 64;

        int i = n;

        while (i > 1) {

            int j = n;

            while (j > 1) {

                System.out.println(
                        "i = " + i + ", j = " + j
                );

                j = j / 2;
            }

            i = i / 2;
        }

        /*
         * Outer loop:
         *
         * n → n/2 → n/4 → ...
         *
         * Time Complexity: O(log n)
         *
         * Inner loop also halves its value:
         *
         * n → n/2 → n/4 → ...
         *
         * Time Complexity: O(log n)
         *
         * Both loops are nested.
         *
         * Therefore:
         *
         * O(log n) × O(log n)
         * = O(log² n)
         *
         * Time Complexity: O(log² n)
         * Space Complexity: O(1)
         */
    }
}