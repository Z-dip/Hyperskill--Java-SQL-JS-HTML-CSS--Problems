import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]part = scanner.nextLine().split(" ");
        BigInteger a = new BigInteger(part[0]);
        BigInteger b = new BigInteger(part[1]);
        BigInteger c = new BigInteger(part[2]);
        BigInteger d = new BigInteger(part[3]);
        BigInteger num = a.negate();
        num = num.multiply(b);
        num = num.add(c);
        num = num.subtract(d);
        System.out.println(num);
    }
}
