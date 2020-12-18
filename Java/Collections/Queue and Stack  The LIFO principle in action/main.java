
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> integerDeque = new ArrayDeque<>();
        int sizeOfDeque = scanner.nextInt();
        for (int i = 0; i < sizeOfDeque; i++) {
            int dequeElement = scanner.nextInt();
            integerDeque.offer(dequeElement);
        }
        ArrayList<Integer> arrlist = new ArrayList<>(integerDeque);
        Collections.reverse(arrlist);
        for (Integer x : arrlist) {
            System.out.println(x);
        }
    }
}
