import java.util.Arrays;
import java.util.List;

class Scratch {

    /**
     * Reverses a mutable list in-place
     *
     * @param integers - a mutable list of integers
     * @throws UnsupportedOperationException if an immutable list is given
     */
    public static void reverseInPlace(List<Integer> integers) {
        int aux;
        int position;
        for (int i = 0; i < (integers.size() / 2); i++) {
            aux = integers.get(i);
            position = integers.size() - i - 1;
            integers.set(i, integers.get(position));
            integers.set(position, aux);
        }
    }

    /**
     * Output:
     * <p>
     * [1, 5, 8, 2, 4, 15, 7312, 612, 612, 12, 451, 11]
     * [11, 451, 12, 612, 612, 7312, 15, 4, 2, 8, 5, 1]
     */
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 5, 8, 2, 4, 15, 7312, 612, 612, 12, 451, 11);
        System.out.println(integers);
        reverseInPlace(integers);
        System.out.println(integers);
    }
}
