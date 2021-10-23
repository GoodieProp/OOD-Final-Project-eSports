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
 * Command to order snacks
 */
public class SnackOrder implements Command{
	CafeEmployee ce;
	String or;
	
	public SnackOrder(CafeEmployee ce, String order) {
		this.ce = ce;
		this.or = order;
	}
	
	public void orderUp() {
		ce.setSnacks(or);
		ce.takeOrder("Snack");
		
	}

}
