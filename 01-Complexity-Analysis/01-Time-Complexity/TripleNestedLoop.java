public class TripleNestedLoop {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {

                    System.out.println(
                            i + " " + j + " " + k
                    );
                }
            }
        }

        /*
         * First loop: O(n)
         *
         * Second loop: O(n)
         *
         * Third loop: O(n)
         *
         * Total:
         *
         * O(n) × O(n) × O(n)
         * = O(n³)
         *
         * Time Complexity: O(n³)
         * Space Complexity: O(1)
         */
    }
}