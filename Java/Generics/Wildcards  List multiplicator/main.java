import java.util.ArrayList;
import java.util.List;

/**
 * Class to modify
 */
class ListMultiplicator {

    /**
     * Repeats original list content provided number of times
     *
     * @param list list to repeat
     * @param n    times to repeat, should be zero or greater
     */
    public static/*<T>*/ void multiply(List<?/*T*/> list, int n) {

        // TESTS PASS, NO IDEA WHY THIS IS WRONG

       /* ArrayList arrayList = (ArrayList) list;
        if (n == 0) {
            list.clear();
        }
        for (int i = 1; i < n; i++) {
            arrayList.addAll(list);
            list = arrayList;
        } */


        if (n == 0) {
            list.clear();
        } else if (n > 1) {
            nCopies(list, n);
        }
    }

    private static <T> void nCopies(List<T> list, int n) {
        List<T> original = new ArrayList<>(list);
        for (int i = 1; i < n; i++) {
            list.addAll(original);
        }
    }
}




