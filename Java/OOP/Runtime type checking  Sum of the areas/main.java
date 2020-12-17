class Sum {
    public static int sumOfAreas(Shape[] array) {
        int sumOfArea = 0;
        for (Shape shape : array) {
            if (shape.getClass() == Square.class) {
                int sideOnTwo = ((Square) shape).getSide() * ((Square) shape).getSide();
                sumOfArea = sumOfArea + sideOnTwo;
            } else if (shape.getClass() == Rectangle.class) {
                sumOfArea += ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
            }
        }
        return sumOfArea;
    }
}


//Don't change the code below
class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
