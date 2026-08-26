public class AuxiliarySpace {

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
         * The input array already exists.
         *
         * The algorithm creates another array of size n.
         * This additional memory is auxiliary space.
         *
         * Auxiliary Space: O(n)
         */
    }
}