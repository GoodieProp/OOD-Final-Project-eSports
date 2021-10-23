/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public class Nachos extends Snack {

	public Nachos() {
		description = "Salted Tortilla Chips with American, Gouda, and Provolone Cheese";
	}
	
	@Override
	public double cost() {
		return 15.00;
	}

	@Override
	public Integer drinkVoucher() {
		return null;
	}

	@Override
	public Integer snackVoucher() {
		return null;
	}
	
	
}
