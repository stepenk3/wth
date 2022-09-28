import java.util.InputMismatchException;
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
public class Lab3 {
	public static void showmenu() {		
		System.out.println("Please Enter:\n"
						+ "1. Add Item\n"
						+ "2. Search for Item\n"
						+ "3. Display List\n"
						+ "4. Exit");

	}
	
	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		Binarysearch arraylist = new Binarysearch();
		int option= 0;
		int target;
		do {
			try {
				Lab3.showmenu();
				option = keyboard.nextInt();
				switch(option) {
				case 1:
					arraylist.addItems(keyboard);
					break;
				case 2:
					System.out.println("enter the number you are looking for: ");
					target= keyboard.nextInt();
					System.out.println(arraylist.binarySearch(arraylist.arraylist, target));
					break;
				case 3:
					arraylist.displayList();
					break;
				case 4:
					break;
				default: 
					System.out.println("Invalid input ... please choose option from 1-4");
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println("Invalid input ... please try again");
				keyboard.nextLine();		

			}
			
		}while(option != 4);
		System.out.println("Exiting...");

	}

}
