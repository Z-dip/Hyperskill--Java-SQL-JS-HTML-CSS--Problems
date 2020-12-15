import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String wholeLine = reader.readLine();
        wholeLine.trim();
        reader.close();
        String[] stringArr;

        if (wholeLine.isBlank()) {
            System.out.println("0");
        } else {
            wholeLine = wholeLine.replaceFirst("^\\s*", "");
            stringArr = wholeLine.split("\\s+");
            System.out.println(stringArr.length);
        }
    }
}
