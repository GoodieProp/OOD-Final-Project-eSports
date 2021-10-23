/**
 * 
 */
package Command;

import java.util.ArrayList;

import CafeFactoryDecorator.CafeEmployee;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * Command to order drinks
 */
public class DrinkOrder implements Command {
	CafeEmployee ce;
	String or;
	
	public DrinkOrder(CafeEmployee ce, String drink) {
		this.ce = ce;
		this.or = drink;
	}
	
	public void orderUp() {
		ce.setDrinks(or);
		ce.takeOrder("Drink");
	}
}
