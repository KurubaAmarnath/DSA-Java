public class MultipleVariables {

    public static void main(String[] args) {

        int number = 10;
        int square = number * number;
        int cube = number * number * number;
        int doubleValue = number * 2;
        int tripleValue = number * 3;

        System.out.println("Number: " + number);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Double: " + doubleValue);
        System.out.println("Triple: " + tripleValue);

        /*
         * Multiple variables are created.
         *
         * However, the number of variables is fixed.
         * It does not increase with the input size.
         *
         * Therefore:
         *
         * Space Complexity: O(1)
         */
    }
}