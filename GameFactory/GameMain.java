/**
 * 
 */
package GameFactory;

import java.util.InputMismatchException;
import java.util.Scanner;
import Command.GameOrder;
import Command.eSportsEmployee;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * Display to the user the game bar menu options.
 */
public class GameMain {
	eSportsEmployee esp = new eSportsEmployee();
	GameEmployee ge = new GameEmployee();
	private static String gameType;
	
	private void gameChoice(int choice) {
		if (choice == 1) {
			gameType = "fps";
		} else if (choice == 2) {
			gameType = "br";
		}
		GameOrder go = new GameOrder(ge, gameType);
		esp.purchase(go);	
	}
	
	public void gameBar() {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		int choice;
		
		System.out.println("\n*-----* Game Bar *-----*");
		System.out.println("Welcome to the Game Bar! You will be able to buy Game Slots here!");
		System.out.println("You can only play game at a time!");
		System.out.println("Here are your options!\n");
		do {
			try {
				System.out.println("1. Battlefield 2042 - Team Deathmatch (FPS)");
				System.out.println("2. Call of Duty Warzone (Battle Royale)");
				System.out.println("3. Go back");
				System.out.print("Please choose a number: ");
				choice = sc.nextInt();
				if (choice > 3) {
					System.out.println("Please input an number from the menu options.");
					sc.reset();
				} else if (choice == 3) {
					System.out.println("Well then, we have more games later on!");
					done = true;
				} else {
					gameChoice(choice);
					done = true;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Please input a number from the menu. Not a letter...");
				sc.reset();
				sc.next();
			}
		} while (done != true);
	}
}
