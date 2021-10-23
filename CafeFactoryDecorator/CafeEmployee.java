/**
 * 
 */
package CafeFactoryDecorator;
import java.util.ArrayList;
import FrontDesk.FrontDeskMenu;
import CurrentVenueInfo.currentVenueInfo;

/**
 * @author Xavier Gonzalez
 *
 */
public class CafeEmployee {
	private static currentVenueInfo cvi = new currentVenueInfo();
	FrontDeskMenu fdm = new FrontDeskMenu();
	String sna = "";
	String dri = "";
	double snackTotalCost = 0;
	double drinkTotalCost = 0;
	int snackVoucher = 0;
	int drinkVoucher = 0;

	
	public void setSnacks(String snack) {
		this.sna = snack;
	}
	
	public void setDrinks(String drink) {
		this.dri = drink;
	}
	
	public void takeOrder(String string) {
		Snack s;
		Drink d;
		SnackFactory sf = new SnackFactory();
		DrinkFactory df = new DrinkFactory();
		snackVoucher = fdm.getSnackVouchers();
		drinkVoucher = fdm.getDrinkVouchers();
		if (string.equalsIgnoreCase("Snack")) {
			if (sna.equalsIgnoreCase("Pizza")) {
				s = sf.createSnack(sna);
				s = new PizzaDecorator(s);
				if (snackVoucher > 0) {
					snackTotalCost = 0;
					fdm.removeSnackVouchers();
					System.out.println("You had a snack voucher! Your snack will be free!");
				} else {
					snackTotalCost += s.cost();
				}
				System.out.println("You ordered a: " + s.getDescription() + " $" + s.cost());
				
			} else {
				s = sf.createSnack(sna);
				if (snackVoucher > 0) {
					snackTotalCost = 0;
					fdm.removeSnackVouchers();
					System.out.println("You had a snack voucher! Your snack will be free!");
				} else {
					snackTotalCost += s.cost();
					System.out.println("You ordered a: " + s.getDescription() + " $" + s.cost());
				}
			}
			cvi.setItemNames(s.getDescription()); //receipt use
			cvi.setItemPrice(snackTotalCost); // receipt use
			snackTotalCost = 0;
		} else if (string.equalsIgnoreCase("Drink")) {
			if (dri.equalsIgnoreCase("Vanilla Shake")) {
				d = df.createDrink(dri);
				d = new VanillaShakeAdditional(d);
				if (drinkVoucher > 0) {
					drinkTotalCost = 0;
					System.out.println("You had a drink voucher! Your drink will be free!");
					fdm.removeDrinkVouchers();
				} else {
					drinkTotalCost += d.cost();
				}
				System.out.println(d.getDescription() + " $" + String.format("%.2f", drinkTotalCost));
			} else {
				d = df.createDrink(dri);
				if (drinkVoucher > 0) {
					drinkTotalCost = 0;
					System.out.println("You had a drink voucher! Your drink will be free!");
					fdm.removeDrinkVouchers();
				} else {
					d = df.createDrink(dri);
					drinkTotalCost += d.cost();
					System.out.println("You ordered a: " + d.getDescription() + " $" + d.cost());
				}
			}
			cvi.setItemNames(d.getDescription());
			cvi.setItemPrice(snackTotalCost);
			drinkTotalCost = 0;
		}
	}
}
