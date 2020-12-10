import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int good = 0;
        int big = 0;
        int small = 0;
        
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            
            if (num > 0) {
                big++;
            } else if (num < 0) {
                small++;
            } else if (num == 0) {
                good++;
            }
        }        
        System.out.println(good + " " + big + " " + small);  
    }
}
