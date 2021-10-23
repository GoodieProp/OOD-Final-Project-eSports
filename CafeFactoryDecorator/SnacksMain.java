/**
 * 
 */
package CafeFactoryDecorator;


/**
 * @author Xavier Gonzalez
 *
 */
public class SnacksMain {
	SnackFactory sf;
	
	public SnacksMain(SnackFactory sf) {
		this.sf = sf;
	}

	public Snack order(String type) {
		Snack s = null;
		if (type.equals("cheeseburger")) {
			s = new Cheeseburger();
		} else if (type.equals("nachos")) {
			s = new Nachos();
		} else if (type.equals("pizza")) {
			s = new Pizza();
		}
		return s;
	}
}
