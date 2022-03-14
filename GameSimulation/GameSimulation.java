/**
 * 
 */
package GameSimulation;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import CurrentVenueInfo.currentVenueInfo;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * Displays to the user a simulation of a game. Only tells the user if they won or lost.
 */
public class GameSimulation {
	private static Random ran = new Random(System.currentTimeMillis());
	private static currentVenueInfo cvi = new currentVenueInfo();
	private static void playBF2042() {
		int c = ran.nextInt(2);
		if (c == 1) {
			System.out.println("Congratulations! You won your match!");
		} else if (c == 2) {
			System.out.println("Bad luck...you have lost..");
		} else if (c == 0) {
			System.out.println("It's a draw!");
		}
	}
	
	private static void playCOD() {
		int chance = ran.nextInt(1);
		if (chance == 0) {
			System.out.println("You won!");
		} else if (chance == 1) {
			System.out.println("You lost..");
		}
	}
	
	public void game() {
		ArrayList<String> games = new ArrayList<String>();
		games = cvi.getCurrentGameSlot();
		String game = "";
		for (int i = 0; i < games.size(); i++) {
			game = games.get(i);
			break;
		}
		if (game.equalsIgnoreCase("Battlefield 2042")) {
			playBF2042();
			cvi.removeCurrentGameSlot();
		} else if (game.equalsIgnoreCase("Call of Duty Warzone")) {
			playCOD();
			cvi.removeCurrentGameSlot();
		}
	}
	
	public void playMenu() {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		int choice;
		do {
			try {
				System.out.println("\n*-----* Gaming Hub *-----*\n");
				System.out.println("Hello there! You will be playing your games in the same order you purchased them!");
				System.out.println("If you were able to ask a question about what you would do here, you will know"
						+ "\nthat you will be see a simulated game. Hope that's clear enough!");
				System.out.println("\nHere are your options!");
				System.out.println("1. Play Game\n2. Go back");
				System.out.print("Please input a number: ");
				choice = sc.nextInt();
				if (choice > 2) {
					System.out.println("\nPlease enter a valid number.");
					sc.reset();
				} else if (choice == 1) {
					if (cvi.getCurrentGameSlot().size() == 0) {
						System.out.println("\nYou must buy a game before playing.");
						done = true;
					} else {
						game();
					}
				} else if (choice == 2) {
					System.out.println("\nYou're welcome to come back to play some games!");
					done = true;
				}
			} catch (InputMismatchException ex) {
				System.out.println("\nPlease enter a number, not a letter.\n");
				sc.reset();
				sc.next();
			}
		} while (done != true);
	}
}
