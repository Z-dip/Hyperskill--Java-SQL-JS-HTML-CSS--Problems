import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char read = (char) reader.read();
        StringBuilder stringBuilder = new StringBuilder();

        while (read != -1 && read > 48 && read < 57 || read > 96 && read < 123) {

            stringBuilder.append(read);
            read = (char) reader.read();
        }
        System.out.println(stringBuilder.reverse());
        reader.close();
    }
}
