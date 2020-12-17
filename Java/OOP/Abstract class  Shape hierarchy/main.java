abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
       double s = (a + b + c) / (double) 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Rectangle extends Shape {
    double l1;
    double l2;

    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    double getPerimeter() {

        return l1 * 2 + l2 * 2;
    }

    @Override
    double getArea() {
        return l1 * l2;
    }
}

class Circle extends Shape {
    double s;

    public Circle(double s) {
        this.s = s;
    }

    @Override
    double getPerimeter() {
        return (2 * s) * Math.PI;
    }

    @Override
    double getArea() {
        return Math.PI * (s * s);
    }
}

