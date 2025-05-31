public class Car {
    private final String make;
    private final String model;
    private double pricePerDay;
    private boolean available = true;

    public Car(String make, String model, double pricePerDay) {
        this.make = make;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double price) {
        this.pricePerDay = price;
    }

    public void rent() {
        available = false;
    }

    public void returnCar() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }
}