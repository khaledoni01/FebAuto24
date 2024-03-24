package OOP;

public class ChildClass {


    public static void main(String[] args) {

        ParentClass p = new ParentClass();

        p.setName("Nishat");
        System.out.println( p.getName() );

        p.setNumber(10);
        System.out.println( p.getNumber() );

    }
}
