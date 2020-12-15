import java.util.function.*;

class Operator {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {


        return t -> {
            U operated = null;
            if (condition.test(t)) {
                operated = ifTrue.apply(t);
            } else {
                operated = ifFalse.apply(t);
            }
            return operated;
        }; // your implementation here


    }
}
