public class LinearPlusQuadratic {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int n = numbers.length;

        // Linear operation
        for (int i = 0; i < n; i++) {

            System.out.println(numbers[i]);
        }

        // Quadratic operation
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.println(
                        numbers[i] + " " + numbers[j]
                );
            }
        }
        /*
         * First loop: O(n)
         *
         * Nested loops: O(n²)
         *
         * Total:
         *
         * O(n) + O(n²)
         *
         * We keep the dominant term.
         *
         * Time Complexity: O(n²)
         * Space Complexity: O(1)
         */
    }
}