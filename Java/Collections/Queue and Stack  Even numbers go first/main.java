import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> integerDeque = new ArrayDeque<>();
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int commingElement = scanner.nextInt();
            if (commingElement % 2 == 0) {
                integerDeque.offerFirst(commingElement);
            } else {
                integerDeque.offerLast(commingElement);
            }
        }
        for (Integer inQueue : integerDeque) {
            System.out.println(inQueue);
        }


    }
}
