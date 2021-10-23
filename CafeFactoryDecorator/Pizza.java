/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public class Pizza extends Snack{
	public Pizza() {
		description = "a Pizza with Sausage and Peperoni";
	}

	public double cost() {
		return 15.00;
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
