public class MultipleLoops {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            System.out.println(i);
        }

        for (int i = 0; i < n; i++) {

            System.out.println(i);
        }

        /*
         * First loop: O(n)
         *
         * Second loop: O(n)
         *
         * Total:
         *
         * O(n) + O(n)
         * = O(2n)
         * = O(n)
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */
    }
}