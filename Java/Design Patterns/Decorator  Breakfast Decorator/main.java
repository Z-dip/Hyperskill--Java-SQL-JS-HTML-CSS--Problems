class TestDrive {
    public static void main(String[] args) {
        /* write your code here */
        ;
        Bread bagel = new Bagel();


        bagel = new Butter(bagel);
        bagel = new Butter(bagel);
        bagel = new Ham(bagel);
        bagel = new Cheese(bagel);

        System.out.println(bagel.getDescription() + ". kCal: " + bagel.getKcal());

        Bread bun = new Bun();
        bun = new Butter(bun);
        bun = new Jam(bun);
        bun = new Jam(bun);

        System.out.println(bun.getDescription() + ". kCal: " + bun.getKcal());
    }
}

abstract class Bread {
    String description;
    int kcal;

    String getDescription() {
        return description;
    }

    int getKcal() {
        return kcal;
    }

    @Override
    public String toString() {
        return getDescription() + ". kCal: " + getKcal();
    }
}

class Bagel extends Bread {

    Bagel() {
        description = "Bagel";
        kcal = 250;
    }
}

class Bun extends Bread {

    Bun() {
        description = "Bun";
        kcal = 150;
    }
}

abstract class Decorator extends Bread {
    abstract String getDescription();

    abstract int getKcal();
}

class Butter extends Decorator {
    private Bread bread;

    Butter(Bread bread) {
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription()/* write your code here */ + ", Butter";
    }

    @Override
    int getKcal() {
        return bread.getKcal()/* write your code here */ + 50;
    }
}

class Jam extends Decorator {

    private Bread bread;

    Jam(Bread bread) {
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription()/* write your code here */ + ", Jam";
    }

    @Override
    int getKcal() {
        return bread.getKcal()/* write your code here */ + 120;
    }
}

class Cheese extends Decorator {

    private Bread bread;

    Cheese(Bread bread) {
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription()/* write your code here */ + ", Cheese";
    }

    @Override
    int getKcal() {
        return bread.getKcal()/* write your code here */ + 40;
    }
}

class Ham extends Decorator {

    private Bread bread;

    Ham(Bread bread) {
        this.bread = bread;
    }

    @Override
    String getDescription() {
        return bread.getDescription()/* write your code here */ + ", Ham";
    }

    @Override
    int getKcal() {
        return bread.getKcal()/* write your code here */ + 2500;
    }
}
