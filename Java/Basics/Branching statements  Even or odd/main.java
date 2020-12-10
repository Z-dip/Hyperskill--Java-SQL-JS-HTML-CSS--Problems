import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        
        while (n != 0) {
            n = scanner.nextInt();
            if (n % 2 == 0 && n != 0 ) {
                System.out.println("even");
            } else if (n % 2 != 0 && n != 0) {
                System.out.println("odd");
            }
        }
    }
}
