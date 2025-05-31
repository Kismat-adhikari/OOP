public class Dog {
    private String name, breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Max", "Labrador");
        Dog d2 = new Dog("Rocky", "Bulldog");

        d1.setName("Buddy");
        d2.setBreed("Beagle");

        d1.printInfo();
        d2.printInfo();
    }
}