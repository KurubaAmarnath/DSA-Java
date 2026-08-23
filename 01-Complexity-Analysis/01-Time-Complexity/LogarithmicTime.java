public class LogarithmicTime {

    public static void main(String[] args) {

        int n = 64;

        while (n > 1) {

            System.out.println(n);

            n /= 2;
        }

        /*
         * The input is divided by 2 in every iteration.
         *
         * Time Complexity: O(log n)
         * Space Complexity: O(1)
         */
    }
}