// Save as ques7.java

class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class ques7 {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();

        System.out.println("Area of Circle: " + geometry.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + geometry.calculateArea(4.0, 6.0));
        System.out.println("Area of Triangle: " + geometry.calculateArea(3.0, 4.0, true));
    }
}
