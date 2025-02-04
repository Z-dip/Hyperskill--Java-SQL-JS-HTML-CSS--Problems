class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Phone phone;

        PhoneFactory iphoneFactory = new IphoneFactory();/* write your code here */
        PhoneFactory samsungFactory = new SamsungFactory();/* write your code here */

        System.out.println("-Hello, I need Android phone");
        System.out.println("-Okay! Please wait for a sec, - Calling to the SamsungFactory. -Bring me the Samsung Galaxy S10");
        Thread.sleep(1500);

        phone = new SamsungFactory().createPhone();/* write your code here */
        System.out.println(phone.getDescription());
        System.out.println("There it is!\n");

        System.out.println("-Hello, I need iOS phone");
        System.out.println("-Okay! Please wait for a sec, - Calling to the iPhoneFactory. -Bring me the iPhoneXS\"");
        Thread.sleep(1500);

        phone = new IphoneFactory().createPhone();/* write your code here */
        System.out.println(phone.getDescription());
        System.out.println("There it is!");
    }
}

interface PhoneFactory {
    Phone createPhone();
}

class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        PhoneDetailsFactory detailsFactory = new IphoneDetailsFactory();/* write your code here */

        return new Iphone(detailsFactory);/* write your code here */
    }
}

class SamsungFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        PhoneDetailsFactory detailsFactory = new SamsungDetailsFactory();/* write your code here */

        return new Samsung(detailsFactory);/* write your code here */
    }
}

interface PhoneDetailsFactory {
    Camera createCamera();
    Display createDisplay();
    Processor createProcessor();
    Security createSecurity();
}

class IphoneDetailsFactory implements PhoneDetailsFactory {
    @Override
    public Camera createCamera() {
        return new IphoneCamera();/* write your code here */
    }

    @Override
    public Display createDisplay() {
        return new IphoneDisplay();/* write your code here */
    }

    @Override
    public Processor createProcessor() {
        return new IphoneProcessor();/* write your code here */
    }

    @Override
    public Security createSecurity() {
        return new IphoneSecurity();/* write your code here */
    }
}

class SamsungDetailsFactory implements PhoneDetailsFactory {
    @Override
    public Camera createCamera() {
        return new SamsungCamera();/* write your code here */
    }

    @Override
    public Display createDisplay() {
        return new SamsungDisplay();/* write your code here */
    }

    @Override
    public Processor createProcessor() {
        return new SamsungProcessor();/* write your code here */
    }

    @Override
    public Security createSecurity() {
        return new SamsungSecurity();/* write your code here */
    }
}

abstract class Phone {
    Camera camera;
    Display display;
    Processor processor;
    Security security;

    public abstract String getDescription();

    public String toString() {
        return "Camera: " + camera.toString() + "\n"
                + "Display: " + display.toString() + "\n"
                + "Processor: " + processor.toString() + "\n"
                + "Security: " + security.toString();
    }
}

class Iphone extends Phone {
    Iphone(PhoneDetailsFactory detailsFactory) {
        camera = detailsFactory.createCamera();/* write your code here */
        display = detailsFactory.createDisplay();/* write your code here */
        processor = detailsFactory.createProcessor();/* write your code here */
        security = detailsFactory.createSecurity();/* write your code here */
    }

    @Override
    public String getDescription() {
        return "This is THE iPhoneXs\n" + super.toString();
    }
}

class Samsung extends Phone {
    Samsung(PhoneDetailsFactory detailsFactory) {
        camera = detailsFactory.createCamera();/* write your code here */
        display = detailsFactory.createDisplay();/* write your code here */
        processor = detailsFactory.createProcessor();/* write your code here */
        security = detailsFactory.createSecurity();/* write your code here */
    }

    @Override
    public String getDescription() {
        return "Samsung Galaxy S10\n" + super.toString();
    }
}

interface Camera {
    String toString();
}

class IphoneCamera implements Camera {
    @Override
    public String toString() {
        return "12MP";
    }
}

class SamsungCamera implements Camera {
    @Override
    public String toString() {
        return "16MP+12MP+12MP";
    }
}

interface Display {
    String toString();
}

class IphoneDisplay implements Display {
    @Override
    public String toString() {
        return "5.8\" OLED";
    }
}

class SamsungDisplay implements Display {
    @Override
    public String toString() {
        return "6.1\" Dynamic AMOLED";
    }
}

interface Processor {
    String toString();
}

class IphoneProcessor implements Processor {
    @Override
    public String toString() {
        return "A12";
    }
}

class SamsungProcessor implements Processor {
    @Override
    public String toString() {
        return "Exynos 9820";
    }
}

interface Security {
    String toString();
}

class IphoneSecurity implements Security {
    @Override
    public String toString() {
        return "FaceID";
    }
}

class SamsungSecurity implements Security {
    @Override
    public String toString() {
        return "FingerPrint";
    }
}
