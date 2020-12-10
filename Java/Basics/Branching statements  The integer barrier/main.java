import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int total = 0;
        while (num != 0) {
            num = scanner.nextInt();
            total = num + total;
            if (total >= 1000) {
                System.out.println(total - 1000);
                break;
            }
            if (num == 0) {
                System.out.println(total);
                break;
            }
            
        }
    }
}
