package testPackage;

import java.util.Arrays;

public class Day8 {

//    i. Write a method which takes an array of int
//    ii. Array can contain 3 values
//    iii. Add all the values
//    iv. Return the total.
//            Note: Use a loop to do it
//    Ex: arrayTotal({1, 2, 3}) // 6


   public int arrayTotal(int[] aValue) {

       int total = 0;

       for(int i : aValue) {
           total = total + i;
       }

       return total;
   }

    public static void main(String[] args) {

        Day8 d8 = new Day8();

        int[] arrValue = {10, 20};
        System.out.println( d8.arrayTotal(arrValue) );


    }



}
