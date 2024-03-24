package testPackage;

public class Day6 {


//2. Write an if where country is equal to USA, else print -> no
//    language.
//            Nested if should have below conditions
//if state is equal to NY -> print “You’re a survivor”
//            else if state is equal to NJ -> print “You’re a peach lover”

    public static void main(String[] args) {

        String country = "USA";
        String state = "NJ";

        if( country.equals("USA") ) {

            System.out.println("if");

            if(state.equals("NY")) {
                System.out.println("you're a survivor");
            }
            else if(state.equals("NJ")) {
                System.out.println("You're a peach lover");
            }

        }
        else {
            System.out.println("else");
        }

    }
}
