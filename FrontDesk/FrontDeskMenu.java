package FrontDesk;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import CurrentVenueInfo.currentVenueInfo;

/**
 * 
 */

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * Uses the decorator pattern to add additional vouchers
 */
public class FrontDeskMenu {
	// Initialized object and variables
	private static currentVenueInfo cvi = new currentVenueInfo();
	private static Random ran = new Random(System.currentTimeMillis());
	private static String bundleDesc; // for receipt description
	private static Double bundleCost = 0.00; // for receipt description
	private static int barcode = 0;
	private static Double cost = 0.00; // for total price in receipt
	private static int bMin = 10000000;
	private static int bMax = 99999999;
	private static int snackVouchers;
	private static int drinkVouchers;
	private static int gameVouchers;
	int bundleChoice = 0;
	
	// returns barcode when called
	public static Integer getBarcode() {
		return barcode;
	}
	 //return cost when called
	public Double getCost() {
		return cost;
	}
	
	public static Integer getSnackVouchers() {
		return snackVouchers;
	}
	
	public static Integer getDrinkVouchers() {
		return drinkVouchers;
	}
	
	public static Integer getGameVouchers() {
		return gameVouchers;
	}
	
	public void removeSnackVouchers() {
		if (snackVouchers > 0) {
			snackVouchers -= 1;
		}
	}
	
	public void removeDrinkVouchers() {
		if (drinkVouchers > 0) {
			drinkVouchers -= 1;
		}
	}
	
	public void removeGameVouchers() {
		if (gameVouchers > 0) {
			gameVouchers -= 1;
		}
	}
	
	public String getBundleDesc() {
		return bundleDesc;
	}
	
	public Double getBundleCost() {
		return bundleCost;
	}
	
	public static void printStars(int howMany) { 
		String stars = "";
		for (int i = 0; i < howMany; i++) {
			stars = stars + "*";
		}
		System.out.println(stars);
	}
	
	// function that utilizes the decorator design pattern
	public void bundleAdditonalItems() {
		Admission ad;
		Scanner e = new Scanner(System.in);
		boolean done = false;
		int extra;
		
		// if-else within a try-catch within a do-while statement
		do {
			try {
				if (bundleChoice == 1) {
					ad = new AdmissionsFirstBundle();
					cvi.setItemNames(ad.getDescription());
					// gives user +1 in all vouchers
					drinkVouchers += 1;
					snackVouchers += 1;
					gameVouchers += 1;
					barcode = ran.nextInt(bMax - bMin);
					System.out.println("\n*-----* First Bundle Option *-----*\n");
					System.out.println("You have selected the First Bundle! Good choice!");
					System.out.println("One last thing! Would you like to add an extra drink, snack, or game with your order?");
					System.out.println("If so, here are your options..");
					System.out.println("\n1. Extra Drink Voucher ($5)\n2. Extra Snack Voucher ($5)\n3. Extra Game Voucher ($10)\n4. No extras please");
					System.out.print("Please choose a number: ");
					extra = e.nextInt();
					if (extra > 4) {
						System.out.println("Please select a number from the options. Thanks.");
					} else if (extra == 1) {
						ad = new BundleAdditonalDrinks(ad); // decorator function
						cvi.setItemPrice(ad.cost());
						drinkVouchers += 1; // adds +1 to drink vouchers
						done = true;
					} else if (extra == 2) {
						ad = new BundleAdditonalSnacks(ad); // decorator function
						cvi.setItemPrice(ad.cost());
						snackVouchers += 1; // adds +1 to snack vouchers
						done = true;
					} else if (extra == 3) {
						ad = new BundleAdditonalGames(ad); // decorator function
						cvi.setItemPrice(ad.cost());
						gameVouchers += 1; // adds +1 to game vouchers
						done = true;
					} else if (extra == 4) {
						System.out.println("\nThat's okay! Thank you for joining us and we hope you enjoy your stay!");
						done = true;
					} else {
						cvi.setItemPrice(ad.cost());
					}
				} else if (bundleChoice == 2) {
					ad = new AdmissionsSecondBundle();
					// gives user +2 in all vouchers
					drinkVouchers += 2;
					snackVouchers += 2;
					gameVouchers += 2;
					cvi.setItemNames(ad.getDescription());
					barcode = ran.nextInt(bMax - bMin);
					System.out.println("\n*-----* Second Bundle Option *-----*\n");
					System.out.println("You have selected the First Bundle! Good choice!");
					System.out.println("One last thing! Would you like to add an extra drink, snack, or game with your order?");
					System.out.println("If so, here are your options..");
					System.out.println("\n1. Five Extra Drink Voucher ($20)\n2. Five Extra Snack Voucher($20)\n3. Five Extra Game Voucher($40)\n4. No extras please");
					System.out.print("Please choose a number: ");
					extra = e.nextInt();
					if (extra > 4) {
						System.out.println("Please select a number from the options. Thanks.");
					} else if (extra == 1) {
						ad = new BundleAdditonalDrinks(ad); // decorator function
						cvi.setItemPrice(ad.cost()*4);
						drinkVouchers += 5;
						done = true;
					} else if (extra == 2) {
						ad = new BundleAdditonalSnacks(ad); // decorator function
						cvi.setItemPrice(ad.cost()*4);
						snackVouchers += 5;
						done = true;
					} else if (extra == 3) {
						ad = new BundleAdditonalGames(ad); // decorator function
						cvi.setItemPrice(ad.cost()*4);
						gameVouchers += 5;
						done = true;
					} else if (extra == 4) {
						System.out.println("\nThat's okay! Thank you for joining us and we hope you enjoy your stay!");
						done = true;
					} else {
						cvi.setItemPrice(ad.cost());
					}
				}
			} catch (InputMismatchException ex) {
				System.out.println("Please select a number, not a letter.");
				e.reset();
				e.next();
			}
		} while (done != true);
		
	}
	
	// function that goes through a menu for buying a ticket or a bundle
	private void admissionsMenuChoice() {
		Scanner a = new Scanner(System.in);
		boolean done = false;
		int choice;
		int pittyPass;
		do {
			try {
				System.out.println("\n*-----* Admissions Ticket Office *-----*\n");
				System.out.println("Ahhh so you wish to enter the venue!");
				System.out.println("Here are your options: ");
				System.out.println("1. One Admission ticket ($25)");
				System.out.println("2. First Bundle ($50) --This bundle includes admission to the venue, one free game, one free drink, and one free snack.");
				System.out.println("3. Second Bundle ($500) --This bundle includes admission to the venue, two free games, two free drinks, and two free snacks.");
				System.out.println("4. I changed my mind, I don't want to buy a ticket");
				System.out.print("Please choose a number: ");
				choice = a.nextInt();
				if (choice > 4) {
					System.out.println("Either you mistyped a number, or you purposely tried to use a different number. Please try again.");
					a.reset();
				} else if (choice == 1) {
					cost += 25;
					barcode = ran.nextInt(bMax - bMin);
					System.out.println("\nThis is your new barcode: " + barcode);
					System.out.println("Thank you for your purchase and enjoy your day! "
							+ "\nOne last thing, we have a cafe if you are getting thirsty or hangry!\n");
					done = true;
				} else if (choice == 2) {
					bundleChoice = 1;
					bundleAdditonalItems();
					bundleChoice = 0;
					done = true;
				} else if (choice == 3) {
					bundleChoice = 2;
					bundleAdditonalItems();
					bundleChoice = 1;
					done = true;
				} else if (choice == 4) {
					// gives pitty pass if 
					System.out.println("You seriously just looked at the price, and decided you wanted to leave huh. How broke are you...?");
					pittyPass = ran.nextInt(10);
					if (pittyPass == 0) {
						System.out.println("I guess I'm feeling nice today. I'll just pay for you.");
						cost += 25;
					} else {
						System.exit(0);
					}
				}
			} catch (InputMismatchException ex) {
				System.out.println("You must input a number...not a letter or word. Please try again..");
				a.reset();
				a.next();
			}
		} while (done != true);
		
	}
	
	// takes care of the menu choice from the welcome function
	public void menuChoice(int wChoice) {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		do {
			try {
				if (wChoice == 1) {
					System.out.print("Please enter your barcode (xxx-xxx-xx): ");
					barcode = sc.nextInt();
					done = true;
				} else if (wChoice == 2) {
					admissionsMenuChoice();
					done = true;
				} else if (wChoice == 3) {
					System.out.println("\nHope you had a nice view of the venue....SIKE YOU THOUGHT!");
					System.exit(0);
				}
			} catch (Exception ex) {
				System.out.println("Something went wrong.");
				sc.reset();
				sc.next();
			}
		} while (done != true);
		
	}
	
	// welcome functions that the user sees first
	public void welcome() {
		Scanner w = new Scanner(System.in);
		printStars(58);
		System.out.println("\tWelcome to the eSports Tournament Program");
		printStars(58);
		System.out.println("If you would like to enter, please choose from the two options: \n");
		int choice = 0;
		boolean done = false;
		do {
			try {
				System.out.println("1. Input Barcode (xxx-xxx-xx) ");
				System.out.println("2. Buy an Admission Ticket");
				System.out.println("3. Leave the Venue");
				System.out.print("Please choose from the following: ");
				choice = w.nextInt();
				if (choice > 3) {
					System.out.println("Please choose a number in the menu.");
					w.reset();
				} else {
					done = true;
				}
			} catch (InputMismatchException ex) {
				System.out.println("You must input a number from the options. Please try again.");
				w.reset();
				w.next();
			}
		} while (done != true);
		menuChoice(choice);
		
	}
}
