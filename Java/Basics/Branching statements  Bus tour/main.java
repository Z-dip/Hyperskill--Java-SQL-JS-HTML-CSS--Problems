import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int bus = scanner.nextInt();
        int n = scanner.nextInt();
        int sc = 0;
        int nulla = 0;
        while (nulla < n) {
            sc = scanner.nextInt();
            nulla++;
    
            if (sc <= bus) {
                System.out.println("Will crash on bridge " + nulla);
                break;
            }
        }
        if (sc > bus) {
            System.out.println("Will not crash");
        }
    }  
}
