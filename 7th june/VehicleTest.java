class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding.");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();

        System.out.println();

        Motorcycle myBike = new Motorcycle();
        myBike.startEngine();
        myBike.ride();
        myBike.stopEngine();
}
    }
