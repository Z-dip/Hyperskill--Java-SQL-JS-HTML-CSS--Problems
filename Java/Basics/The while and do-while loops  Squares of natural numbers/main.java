import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int a = 1;
        int b = 1;
        while (b <= max) {
            b = a * a;
            a++;
            if (b  >= max + 1) {
                break;
            } else {
                System.out.println(b);
            }
        }
        // put your code here
    }
}
