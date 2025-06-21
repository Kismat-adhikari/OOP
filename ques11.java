// Save as ques11.java

abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    @Override
    void playSound() {
        System.out.println("Playing piano melody...");
    }
}

class Guitar extends Instrument {
    @Override
    void playSound() {
        System.out.println("Strumming guitar chords...");
    }
}

class Violin extends Instrument {
    @Override
    void playSound() {
        System.out.println("Playing violin tune...");
    }
}

public class ques11 {
    public static void main(String[] args) {
        Instrument i1 = new Piano();
        Instrument i2 = new Guitar();
        Instrument i3 = new Violin();

        i1.playSound();
        i2.playSound();
        i3.playSound();
    }
}
