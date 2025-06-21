// Save as ques10.java

class Character {
    void attack() {
        System.out.println("Basic attack!");
    }
}

class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior slashes with sword!");
    }
}

class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage casts fireball!");
    }
}

public class ques10 {
    public static void main(String[] args) {
        Character char1 = new Warrior();
        Character char2 = new Mage();

        char1.attack();
        char2.attack();
    }
}
