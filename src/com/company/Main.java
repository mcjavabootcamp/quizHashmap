/*
 * Q: What is the role of a constructor in the class?
 *
 * A: A constructor initializes the class
 */
package com.company;

// import statements go after package declaration, and before class declaration
import java.util.HashMap;
public class Main {

    public static void main(String [] args) {

        // Initialize the hashmap
        HashMap <Integer, String> myMap = new HashMap<Integer, String>();

        // Add keys and values
        myMap.put(1, "oklahoma");
        myMap.put(2, "maryland");
        myMap.put(3, "virginia");

        // Get the value corresponding to the key 3
        System.out.println("The value is " + myMap.get(3));

        // Check to see if "indiana" is in my HashMap
        String myVal = "virginia";
        
        for (String value : myMap.values()) {
            if (myVal==value){
                System.out.println(myVal + " is in the hashmap.");
                break;

            }
        }
        
        // Another way to search is to use a functin of HashMap class
        if (myMap.containsValue(myVal)){
            System.out.println(myVal + " is in the hashmap.");
        }

    }

}
