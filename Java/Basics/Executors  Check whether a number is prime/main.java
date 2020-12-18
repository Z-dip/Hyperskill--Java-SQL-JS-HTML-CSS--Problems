import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()); // assign an object to it

        while (scanner.hasNext()) {
            int number = scanner.nextInt();

            BigInteger bigInteger = BigInteger.valueOf(number);
            if (bigInteger.isProbablePrime(100)) {
                System.out.println(number);
            }
        }
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // write code of task here
    }
}
