
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        int sum = 0;
        Collections.reverse(items);

        for (Future<Callable<Integer>> future : items) {
            try {
                sum = sum + future.get().call();
            } catch (Exception e) {

            }
        }

        return sum;
    }
}
