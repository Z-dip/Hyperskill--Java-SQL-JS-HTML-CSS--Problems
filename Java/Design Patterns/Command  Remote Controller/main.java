import java.util.Scanner;

class Client {

    public static void main(String[] args) {

        Controller controller = new Controller();
        TV tv = new TV();

        Command changeChannel;
        int[] channelList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            channelList[i] = scanner.nextInt();
        }

        Command turnOnTV = new TurnOnCommand(tv);
        /* write your code here */
        tv.turnOn();


        for (int i = 0; i < 3; i++) {
            /* write your code here */
            Channel channel = new Channel(channelList[i]);
            changeChannel = new ChangeChannelCommand(channel);
            channel.changeChannel();
        }

        Command turnOffTV = new TurnOffCommand(tv);
        /* write your code here */
        tv.turnOff();
    }
}

class TV {

    void turnOn() {
        System.out.println("Turning on the TV");
    }

    void turnOff() {
        System.out.println("Turning off the TV");
        /* write your code here */
    }
}

class Channel {
    private int channelNumber;

    Channel(int channelNumber) {
        /* write your code here */
        this.channelNumber = channelNumber;
    }

    void changeChannel() {
        System.out.println("Channel was changed to " + channelNumber);
    }

}

interface Command {
    /* write your code here */
    void execute();
}

class TurnOnCommand implements Command {
    /* write your code here */
    private TV tv;

    TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        /* write your code here */
    }
}

class TurnOffCommand implements Command {
    /* write your code here */
    private TV tv;

    TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        /* write your code here */
    }
}

class ChangeChannelCommand implements Command {
    private Channel channel;

    ChangeChannelCommand(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void execute() {

    }


    /* write your code here */
}

class Controller {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void executeCommand() {
        /* write your code here */
        command.execute();
    }
}
