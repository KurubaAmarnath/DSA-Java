public class LinearSpace {

    static int[] createArray(int n) {

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        return numbers;
    }

    public static void main(String[] args) {

        int n = 5;

        int[] numbers = createArray(n);

        for (int number : numbers) {
            System.out.println(number);
        }

        /*
         * An array of size n is created.
         *
         * Memory grows directly with n.
         *
         * Space Complexity: O(n)
         */
    }
}