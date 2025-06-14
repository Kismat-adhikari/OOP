// q5.java

abstract class Draw{
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw{
    double side;

    Cube(double s){
        side = s;
    }

    double calculateVolume(){
        return side * side * side;
    }

    double calculateArea( ){
        return 6 * side * side;
    }

    double calculatePerimeter(){
        return 12 * side;
    }
}

class Cuboid extends Draw{
    double l, w, h;

    Cuboid(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double calculateVolume(){
        return l*w*h;
    }

    double calculateArea(){
        return 2*(l*w + w*h + h*l);
    }

    double calculatePerimeter(){
        return 4*(l + w + h);
    }
}

class Cylinder extends Draw {
    double r , h ;

    Cylinder(double r , double h){
        this.r = r;
        this.h = h;
    }

    double calculateVolume( ){
        return Math.PI * r * r * h;
    }

    double calculateArea( ){
        return 2 * Math.PI * r * (r + h);
    }

    double calculatePerimeter( ){
        return 2 * Math.PI * r * 2;
    }
}

public class q5 {
    public static void main(String args[]){
        Draw d1 = new Cube(4);
        Draw d2 = new Cuboid(3,4,5);
        Draw d3 = new Cylinder(3,7);

        System.out.println("Cube - Vol: "+d1.calculateVolume()+", Area: "+d1.calculateArea()+", Peri: "+d1.calculatePerimeter());
        System.out.println("Cuboid - Vol: "+d2.calculateVolume()+", Area: "+d2.calculateArea()+", Peri: "+d2.calculatePerimeter());
        System.out.println("Cylinder - Vol: "+d3.calculateVolume()+", Area: "+d3.calculateArea()+", Peri: "+d3.calculatePerimeter());
    }
}
