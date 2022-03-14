/**
 * 
 */
package CurrentVenueInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import FrontDesk.*;
/**

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * Class to use as a hub to display the current personal data of the user, and shows what they have purchased as well.
 */
public class currentVenueInfo {
	private static LinkedHashMap<String, Double> receipt = new LinkedHashMap<String, Double>();
	private static ArrayList<String> itemNames = new ArrayList<String>();
	private static ArrayList<Double> itemPrices = new ArrayList<Double>();
	private static ArrayList<String> currentGameSlot = new ArrayList<String>();
	private static FrontDeskMenu fdm = new FrontDeskMenu();
	private static int snackVoucher;
	private static int drinkVoucher;
	private static int gameVoucher;
	private static Double total;
	
	public void setItemNames(String itemName) {
		itemNames.add(itemName);
	}
	
	public void setItemPrice(double price) {
		double p = 0;
		p += price;
		itemPrices.add(p);
		p = 0;
	}
	
	public ArrayList<String> getItemNames() {
		return itemNames;
	}
	
	public ArrayList<Double> getItemPrices() {
		return itemPrices;
	}
	
	public void setCurrentGameSlot(String game) {
		currentGameSlot.add(game);
	}
	
	public ArrayList<String> getCurrentGameSlot() {
		return currentGameSlot;
	}
	
	public void removeCurrentGameSlot() {
		currentGameSlot.remove(0);
	}
	
	public void viewInfo() {
		int barcode;
		barcode = fdm.getBarcode();
		snackVoucher = fdm.getSnackVouchers();
		drinkVoucher = fdm.getDrinkVouchers();
		gameVoucher = fdm.getGameVouchers();
		total = fdm.getCost();
		
		System.out.println("-----------------------------------------------------------\nPersonal Information:");
		System.out.println("\nBarcode: " + barcode);
		System.out.println("Current Game: " + currentGameSlot);
		System.out.println("Drink Vouchers: " + drinkVoucher + "\nSnack Vouchers: " + snackVoucher + "\nGame Vouchers: " + gameVoucher);
		if (itemNames.size() == 0) {
			System.out.println("");
			System.out.println("-----------------------------------------------------------");
		} else {
			for (int i = 0; i < itemNames.size(); i++) {
				System.out.println("Order #" + (i+1) + " Item Name: " + itemNames.get(i) + " Price: " + itemPrices.get(i) + "");
			}
			System.out.println("-----------------------------------------------------------\n");
		}
	}
}
