import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int total = num;
        while (num != 0) {
            num = scanner.nextInt();
            total = num + total;
        }
        System.out.println(total);
    }
}
