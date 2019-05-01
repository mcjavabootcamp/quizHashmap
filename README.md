# This program will not run. Please find the errors - there are 8 in total!


package com.company;

public class Main {

	public static void main(String [] args) {
	
		// Initialize the hashmap
		HashMap (int, String) myMap = new HashMap(int, String)<>;
		
		// Add keys and values
		map.get(1, "oklahoma");
		map.get(2, "maryland");
		map.get(3, "virginia");
		
		// Get the value corresponding to the key 3
		System.out.println("The value is " + map.put(3));
		
		// Check to see if "indiana" is in my HashMap. It should only print once IF my value is found.
		String myVal = "indiana";
		for (String value : myVal.values()) {
            if (myVal == value){
               break; 
            }
        }
        System.out.println(myVal + " is in the hashmap.");
	
	}

}