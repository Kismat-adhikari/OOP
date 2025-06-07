class Shape {
    int length;
    int breadth;
    int radius;
    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    void calculateArea() {
        System.out.println("Rectangle area: " + (length * breadth));
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }
    
    void calculateArea() {
        System.out.println("Square area: " + (length * breadth));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }
    void calculateArea() {
        System.out.println("Circle area: " + (3.1416 * radius * radius));
    }
}

public class GeometryTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
        r.calculateArea();

        Square s = new Square(4);
        s.calculateArea();

        Circle c = new Circle(3);
        c.calculateArea();
}
}
