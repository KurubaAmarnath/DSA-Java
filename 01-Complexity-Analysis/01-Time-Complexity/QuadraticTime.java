public class QuadraticTime {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }

        /*
         * Outer loop: O(n)
         * Inner loop: O(n)
         *
         * Total: O(n × n)
         *
         * Time Complexity: O(n²)
         * Space Complexity: O(1)
         */
    }
}