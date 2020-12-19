import java.util.Scanner;

/* Product - Motor */
abstract class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "motor={model:" + model + ",power:" + power + "}";
    }
}

class PneumaticMotor extends Motor {
    public PneumaticMotor(String model, long power) {
        super(model, power);
        System.out.print("Pneumatic ");
    }
}

class HydraulicMotor extends Motor {
    public HydraulicMotor(String model, long power) {
        super(model, power);
        System.out.println("Hydraulic ");
    }
}

class ElectricMotor extends Motor {
    public ElectricMotor(String model, long power) {
        super(model, power);
        System.out.print("Electric ");
    }
}

class WarpDrive extends Motor {
    public WarpDrive(String model, long power) {
        super(model, power);
        System.out.println("Warp ");
    }
}

class MotorFactory {

    public static Motor make(char type, String model, long power) {
        type = Character.toLowerCase(type);
        if (type == ('p')) {
            return new PneumaticMotor(model, power);
        } else if (type == ('h')) {
            return new HydraulicMotor(model, power);
        } else if (type == ('e')) {
            return new ElectricMotor(model, power);
        } else if (type == ('w')) {
            return new WarpDrive(model, power);
            }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);     
        final String model = scanner.next();
        final long power = scanner.nextLong();

        MotorFactory motorFactory = new MotorFactory();
        Motor motor = motorFactory.make(type, model, power);
        scanner.close();
        System.out.println(motor);
    }
}
