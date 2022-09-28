import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * CET - CS Academic Level 3
 * Declaration: I declare that this is my own original work and is free from Plagiarism
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Gia Bao Tran
 * Student Number: 041048694
 * Section #:  	300 
 * Course: CST8130 - Data Structures
 * Professor: James Mwangi PhD. 
 * 
 */

public class Binarysearch {
	ArrayList<Integer> arraylist = new ArrayList<>();
	
	/**
	 * This method allows user to input  values to the arraylist 
	 * @param keyboard
	 */
	public void addItems(Scanner keyboard){
		System.out.println("Please specify Integer: ");
		arraylist.add(keyboard.nextInt());
		Collections.sort(arraylist);
	}
	
	
	/**
	 * This  method will perform binarySearch and return users the index of the element they are looking for
	 * @param keyboard
	 */
	 String binarySearch(ArrayList<Integer> arraylist, int x)
	    {
	 
	        int leftPart = 0;
	        int rightPart = arraylist.size() - 1;
	 
	        // Checking element in whole array
	        while (leftPart <= rightPart) {
	            int middle = leftPart + (rightPart - leftPart) / 2;
	 
	            // Check if x the at middle inedex
	            if (arraylist.get(middle) ==(x)) {	            	
	            	return "Index of Integer is: " + middle + "\n";
	            }
	 
	            // If x greater, ignore the rest on the left
	            if (arraylist.get(middle) < x) {
	            	leftPart = middle + 1;	            	
	            }
	 
	            // If x is smaller,
	            // element is on left side
	            else
	            	rightPart = middle - 1;
	        }
	 
	        //If element is not in the arraylist, returns -1 mean index does not exist
	        return "Index of Integer is: not found\n";
	    }	
	/**
	 * Print current elements in the arraylist
	 */
	public void displayList(){
		System.out.println(arraylist.toString()+ "\n");
		
	}
	
	
}
