/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public class SnackFactory {

	public static Snack createSnack(String type) {
		Snack s = null;
		
		if(type.equalsIgnoreCase("cheeseburger")) {
			s = new Cheeseburger();
		} else if (type.equalsIgnoreCase("nachos")) {
			s = new Nachos();
		} else if (type.equalsIgnoreCase("pizza")) {
			s = new Pizza();
		}
		
		return s;
	}

}
