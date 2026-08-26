public class QuadraticSpace {

    public static void main(String[] args) {

        int n = 3;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + j;
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        /*
         * A two-dimensional matrix of size n x n is created.
         *
         * Number of elements:
         *
         * n * n = n²
         *
         * Memory grows quadratically with input size.
         *
         * Space Complexity: O(n²)
         */
    }
}