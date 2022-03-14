/**
 * 
 */
package CafeFactoryDecorator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Command.DrinkOrder;
import Command.SnackOrder;
import Command.eSportsEmployee;
import FrontDesk.FrontDeskMenu;

/**
 * @author Xavier Gonzalez
 *
 */
public class CafeMain {
	eSportsEmployee esp = new eSportsEmployee();
	CafeEmployee ce = new CafeEmployee();
	private static String dri;
	private static String sna;
	
	public void createOrder(String type) {
		SnackOrder so = new SnackOrder(ce, sna);
		DrinkOrder dos = new DrinkOrder(ce, dri);
		if (type.equalsIgnoreCase("snack")) {
			esp.purchase(so);
		} else if (type.equalsIgnoreCase("drink")) {
			esp.purchase(dos);
		}
	}
	public void cafeChoice(int choice) {
		Scanner sc = new Scanner(System.in);
		int cChoice = 0;
		boolean done = false;

		if (choice == 1) {
			try {
				System.out.println("\nSo you're thirsty huh :D");	
				System.out.println("Here are the drinks we currently offer");
				System.out.println("1. Vanilla Shake\n2. Coca Cola\n3. Sprite");
				System.out.print("Please choose a number: ");
				cChoice = sc.nextInt();
				if (cChoice > 5) {
					System.out.println("You must select an option from the menu");
					sc.reset();
					sc.next();
				} else if (cChoice == 1) {
					dri = "Vanilla Shake";
					System.out.println("You have selected: " + dri);
					done = true;
				} else if (cChoice == 2) {
					dri = "Coca Cola";
					System.out.println("You have selected: " + dri);
					done = true;
				} else if (cChoice == 3) {
					dri = "Sprite";
					System.out.println("You have selected: " + dri);
					done = true;
				}
				System.out.println("Your drink will be prepared in a short moment.");
				createOrder("drink");
				System.out.println("Your drink is ready!");
			} catch (InputMismatchException ex) {
				System.out.println("Please input a number.");
				sc.reset();
				sc.next();
			}
		} else if (choice == 2) {
			try {
				System.out.println("\nI bet you're hangry, or just hungry hehe");
				System.out.println("Here are the snacks we currently offer");
				System.out.println("1. Pizza ($15)\n2. Nachos with Cheese($15)\n3. Cheeseburger with Wagyu A5 Ground beef ($100)");
				System.out.print("Please choose a number: ");
				cChoice = sc.nextInt();
				if (cChoice > 3) {
					System.out.println("You must select an option from the menu");
					sc.reset();
					sc.next();
				} else if (cChoice == 1) {
					sna = "Pizza";
					System.out.println("\nYou have selected: " + sna);
					done = true;
				} else if (cChoice == 2) {
					sna = "Nachos";
					System.out.println("\nYou have selected: " + sna);
					done = true;
				} else if (cChoice == 3) {
					sna = "Cheeseburger";
					System.out.println("\nYou have selected: " + sna);
					done = true;
				}		
				System.out.println("Your snack will be prepared in a short moment.");
				createOrder("snack");
				System.out.println("Your snack is ready!");
			} catch (InputMismatchException ex) {
				System.out.println("Please input a number.");
				sc.reset();
				sc.next();
			}
		}
	}

	public void cafeBar() {
		Scanner sc = new Scanner(System.in);	
		boolean done = false;
		int choice;
		System.out.println("*-----* Cafe Bar *-----*");
		System.out.println("\nWelcome to the Cafe Bar! You will be able to order Drinks and Snacks here!");
		System.out.println("Here are your options!");
		do {
			try {
				System.out.println("1. Drink");
				System.out.println("2. Snack");
				System.out.println("3. Go back");
				System.out.print("Please choose a number: ");
				choice = sc.nextInt();
				if (choice > 4) {
					System.out.println("Please input a correct number.");
					sc.reset();
				} else if (choice == 3) {
					System.out.println("Guess your not hungry or thirsty...bye...");
					done = true;
				} else if (choice == 1) {
					cafeChoice(choice);
					done = true;
				} else if (choice == 2) {
					cafeChoice(choice);
					done = true;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Hey, calm down and carefully pick a number. There's no rush to pick either a "
						+ "drink or a snack. Please try again.");
				sc.reset();
				sc.next();
			}
		} while (done != true);
		
	}

}
