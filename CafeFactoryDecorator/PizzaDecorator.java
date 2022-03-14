/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public class PizzaDecorator extends SnackDecorator {

	public PizzaDecorator(Snack s) {
		this.s = s;
	}
	
	@Override
	public String getDescription() {
		return s.getDescription() + ", Extra Pinaapples.";
	}

	public double cost() {
		return s.cost() + 5.00;
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
