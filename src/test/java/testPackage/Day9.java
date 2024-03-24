package testPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Day9 {
//2.
//    i. Create a HashMap with 2 values
//    ii. Loop through the HashMap to print values only using keys

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("Z", "Zebra");

        for(String k : map.keySet() ) {

            System.out.println( map.get(k) );
        }


    }
}
