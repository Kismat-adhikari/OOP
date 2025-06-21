// Save as ques3.java

abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    @Override
    double calculateRent(int days) {
        return days * 50;
    }
}

class Motorcycle extends Vehicle {
    @Override
    double calculateRent(int days) {
        return days * 20;
    }
}

class Bicycle extends Vehicle {
    @Override
    double calculateRent(int days) {
        return days * 10;
    }
}

public class ques3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();
        Vehicle v3 = new Bicycle();

        System.out.println("Car rent: " + v1.calculateRent(3));
        System.out.println("Motorcycle rent: " + v2.calculateRent(3));
        System.out.println("Bicycle rent: " + v3.calculateRent(3));
    }
}
