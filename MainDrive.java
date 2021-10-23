import eSportsMenu.eSportsMenu;
import FrontDesk.FrontDeskMenu;
import java.util.ArrayList;
import CurrentVenueInfo.currentVenueInfo;

/**
 * @author Xavier Gonzalez
 *Class: Object Oriented Development
 */
public class MainDrive {
	// Initialized Objects
	private static eSportsMenu esm = new eSportsMenu();
	private static currentVenueInfo cvi = new currentVenueInfo();
	
	// function to print stars
	private static void printStars(int howMany) { 
		String stars = "";
		for (int i = 0; i < howMany; i++) {
			stars = stars + "*";
		}
		System.out.println(stars);
	}
	
	public static void main(String[] args) {
		FrontDeskMenu fdm = new FrontDeskMenu();
		// initialized variables
		int barcode;
		ArrayList<String> itemNames = new ArrayList<String>();
		ArrayList<Double> itemPrices = new ArrayList<Double>();
		
		// goes through frontDeskMenu welcome function to prompt the user for a unique barcode or to buy an admission ticket
		fdm.welcome();
		barcode = fdm.getBarcode();
		
		// if barcode is 0, it will boot the user out.
		if (barcode != 0) {
			esm.menuChoice();
		} else {
			System.out.println("You're not getting in here without a barcode...restart the program and"
					+ "\n either enter your barcode or buy an admission ticket..");
			System.exit(0);
		}
		
		// Used for giving the user an overview of their purchases. Essentially a receipt
		itemNames = cvi.getItemNames();
		itemPrices = cvi.getItemPrices();
		System.out.println("\nThese are all your purchases from today!");
		for (int i = 0; i < itemNames.size(); i++) {
			System.out.println("Order #" + (i+1) + " Item Name: " + itemNames.get(i) + " Price: " + itemPrices.get(i) + "");
		}
		
	}
}
