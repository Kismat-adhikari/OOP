

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }
    double calculateArea() {
        return 3.1416 * radius * radius;
    }
    double calculateCircumference() {
        return 2 * 3.1416 * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Rectangle perimeter: " + rect.calculatePerimeter());

        Circle cir = new Circle(3);
        System.out.println("Circle area: " + cir.calculateArea());
        System.out.println("Circle circumference: " + cir.calculateCircumference());
    }
    

}
