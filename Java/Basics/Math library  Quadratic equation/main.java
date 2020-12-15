import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1 = (-b + d) / (double) (2 * a);
        double x2 = (-b - d) / (double) (2 * a);
        double xx2 = (double)x2;
        double xx1 = (double)x1;

        if (xx2 < xx1) {
            System.out.println(xx2 + " " + xx1);
        } else {
            System.out.println(xx1 + " " + xx2);
        }
    }
}
