package OOP;

public class ParentClass {

    //    i. Create a private variable
//    ii. Use setter method to set the value
//    iii. Use getter method to get the value
//    iv. Access that variable in other class

    private int number;

    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
