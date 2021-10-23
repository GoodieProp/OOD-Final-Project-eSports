package eSportsMenu;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Observer.venueMembers;
import CafeFactoryDecorator.CafeMain;
import GameFactory.GameMain;
import CurrentVenueInfo.currentVenueInfo;
import GameSimulation.GameSimulation;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * Display eSportsMenu options to the user. Basically a hub.
 */
public class eSportsMenu {
	CafeMain cm = new CafeMain();
	GameMain gm = new GameMain();
	GameSimulation gs = new GameSimulation();
	private static currentVenueInfo cvi = new currentVenueInfo();
	private static venueMembers vm = new venueMembers();
	int wins, losses;
	private static ArrayList<String> currentGameSlot = new ArrayList<String>();
	
	public void menuChoice() {
		
		Scanner mc = new Scanner(System.in);
		boolean done = false;
		int choice;
		System.out.println("\n*-----* eSports Tournament Venue Menu *-----*\n");
		System.out.println("Welcome to the eSports Tournament Yayeet!");
		System.out.println("You will have a personal helper throughout your stay!");
		System.out.println("If you have any questions, please type in the number 6 in the menu options!");
		System.out.println("Other than that, here are your options! :D");
		
		do {
			try {
				System.out.println("\n1. Buy a Game slot");
				System.out.println("2. Play Selected Game");
				System.out.println("3. Go to Cafe");
				System.out.println("4. View Current Personal Data");
				System.out.println("5. View Current Members in Venue");
				System.out.println("6. Leave the venue");
				System.out.print("Please choose a number: ");
				choice = mc.nextInt();
				if (choice > 6) {
					System.out.println("Please select a number from the menu.");
				} else if (choice == 1) {
					gm.gameBar();
				} else if (choice == 2) {
					gs.playMenu();
				} else if (choice == 3) {
					cm.cafeBar();
				} else if (choice == 4) {
					cvi.viewInfo();
				} else if (choice == 5) {
					venueMembers.viewCurrentMemberCount();
				} else if (choice == 6) {
					System.out.println("Thank you for your stay and have a great day!");
					done = true;
				}
				
			} catch (InputMismatchException ex) {
				System.out.println("STAPH inputting something wrong! Please try again...");
				mc.reset();
				mc.next();
			}
		} while (done != true);		
	}
}
