import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String replaceA = a.replace("a", "b");
        System.out.println(replaceA);
    }
}
