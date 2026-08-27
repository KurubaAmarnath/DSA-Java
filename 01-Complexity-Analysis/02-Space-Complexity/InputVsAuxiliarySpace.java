public class InputVsAuxiliarySpace {

    static int[] createCopy(int[] numbers) {

        int[] copy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }

        return copy;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] copy = createCopy(numbers);

        for (int number : copy) {
            System.out.println(number);
        }

        /*
         * Input Space:
         *
         * The original array "numbers" contains n elements.
         *
         * Input Space: O(n)
         *
         *
         * Auxiliary Space:
         *
         * The algorithm creates another array "copy"
         * containing n elements.
         *
         * Auxiliary Space: O(n)
         *
         *
         * Total Space:
         *
         * Input Space + Auxiliary Space
         *
         * O(n) + O(n)
         * = O(n)
         *
         * Total Space Complexity: O(n)
         */
    }
}