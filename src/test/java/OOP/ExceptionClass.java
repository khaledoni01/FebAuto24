package OOP;

public class ExceptionClass {


    public static void main(String[] args) {

        try{
            String abc = "14";
            int number = Integer.parseInt(abc);
            System.out.println( number + 10 );
        }
        catch (Exception e) {
            System.out.println("Please provide only numbers as input");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("this is the final message");
        }


    }
}
