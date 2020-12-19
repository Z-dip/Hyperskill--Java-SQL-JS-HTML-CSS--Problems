import java.util.Scanner;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
      //  String validator = "\\b[' ']{2,}\\b"," "));
        System.out.println(text.replaceAll("\\s+", " "));
        // write your code here
    }
}
