/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public abstract class Snack {
	String description; // decorator use
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public abstract Integer drinkVoucher();
	public abstract Integer snackVoucher();
}
