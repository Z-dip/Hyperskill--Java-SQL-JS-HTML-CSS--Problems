import java.util.Scanner;

class MessageNotifier extends Thread {
    

    String msg;
    int repeats;
    // write fields to store variables here

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
        // implement the constructor
    }

    @Override
    public void run() {
        for (int i = 0; i < repeats; i++) {
            System.out.println(msg);
        }
    }
}
