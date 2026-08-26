public class ConstantSpace {

    public static void main(String[] args) {

        int number = 10;
        int square = number * number;

        System.out.println("Number: " + number);
        System.out.println("Square: " + square);

        /*
         * Only a fixed number of variables are used.
         * Memory usage does not depend on input size.
         *
         * Space Complexity: O(1)
         */
    }
}