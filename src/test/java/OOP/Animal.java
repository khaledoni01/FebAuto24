package OOP;

public abstract class Animal {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Cow extends Animal {
    public void animalSound() {
        System.out.println("Ooo");
    }

    public static void main(String[] args) {

        Cow c = new Cow();

        c.animalSound();
        c.sleep();
    }
}

