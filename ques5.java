// Save as ques5.java

abstract class ManipulatableShape {
    abstract void resize();
    abstract void rotate();
}

class CircleManip extends ManipulatableShape {
    @Override
    void resize() {
        System.out.println("Resizing circle...");
    }

    @Override
    void rotate() {
        System.out.println("Rotating circle...");
    }
}

class SquareManip extends ManipulatableShape {
    @Override
    void resize() {
        System.out.println("Resizing square...");
    }

    @Override
    void rotate() {
        System.out.println("Rotating square...");
    }
}

class TriangleManip extends ManipulatableShape {
    @Override
    void resize() {
        System.out.println("Resizing triangle...");
    }

    @Override
    void rotate() {
        System.out.println("Rotating triangle...");
    }
}

public class ques5 {
    public static void main(String[] args) {
        ManipulatableShape shape1 = new CircleManip();
        ManipulatableShape shape2 = new SquareManip();
        ManipulatableShape shape3 = new TriangleManip();

        shape1.resize();
        shape1.rotate();

        shape2.resize();
        shape2.rotate();

        shape3.resize();
        shape3.rotate();
    }
}
