// Save as ques4.java

abstract class MenuItem {
    abstract void prepare();
}

class Appetizer extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing appetizer...");
    }
}

class MainCourse extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Cooking main course...");
    }
}

class Beverage extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Serving beverage...");
    }
}

public class ques4 {
    public static void main(String[] args) {
        MenuItem m1 = new Appetizer();
        MenuItem m2 = new MainCourse();
        MenuItem m3 = new Beverage();

        m1.prepare();
        m2.prepare();
        m3.prepare();
    }
}
