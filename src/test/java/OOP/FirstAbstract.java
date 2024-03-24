package OOP;

//1.
//        i. Create one abstract class FirstAbstract
//ii. Have one abstract method implementMe() in FirstAbstract class
//iii. Implement the abstract method in a regular class
//iv. Print anything you want in the console
public abstract class FirstAbstract {

    public abstract void implementMe();

    public void test() {
        System.out.println("Test");
    }

}

class Child extends FirstAbstract {

    public void implementMe() {
        System.out.println("Example");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.implementMe();
        c.test();

    }

}