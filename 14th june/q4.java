// q4.java

abstract class Shape{
    abstract double calculateArea( );
    abstract double calculatePerimeter( );
}

class Circle extends Shape{
    double radius;

    Circle(double r){
        radius=r;
    }

    double calculateArea(){
        return Math.PI*radius*radius;
    }

    double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}

class Rectangle extends Shape {
    double l , w;

    Rectangle(double l,double w){
        this.l = l;
        this.w = w;
    }

    double calculateArea( ){
        return l*w;
    }

    double calculatePerimeter( ){
        return 2*(l + w);
    }
}

class Triangle extends Shape{
    double a,b,c;

    Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    double calculateArea(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    double calculatePerimeter( ){
        return a + b + c ;
    }
}

public class q4 {
    public static void main(String args[]){
        Shape c = new Circle(5);
        Shape r = new Rectangle(4,6);
        Shape t = new Triangle(3,4,5);

        System.out.println("Circle Area: "+c.calculateArea()+", Perimeter: "+c.calculatePerimeter());
        System.out.println("Rect Area: "+r.calculateArea()+", Perim: "+r.calculatePerimeter());
        System.out.println("Tri Area: "+t.calculateArea()+", Peri: "+t.calculatePerimeter());
    }
}
