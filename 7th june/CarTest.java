class Vehicle {
    void drive() {
        System.out.println("The vehicle is being driven.");
    }
}

class Car extends Vehicle {
    String brand, model;
    int year;

    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
    void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model );
        System.out.println("Year: " + year);
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("BYD", "12", 2022);
        myCar.drive();
        myCar.display();
    }}
