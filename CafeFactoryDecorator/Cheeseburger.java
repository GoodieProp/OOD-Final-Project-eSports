/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public class Cheeseburger extends Snack{
	public Cheeseburger() {
		description = "A Cheeseburger with a Sesame Seed Bun with Japanese Wagyu A5 Ground Beef"
				+ "\n...with American and Provolone Cheese;";
	}
	
	public double cost() {
		return 100.00;
	}

	@Override
	public Integer drinkVoucher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer snackVoucher() {
		// TODO Auto-generated method stub
		return null;
	}
}
