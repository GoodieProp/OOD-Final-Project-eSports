/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public class VanillaShakeAdditional extends DrinkDecorator {

	public VanillaShakeAdditional(Drink d) {
		this.d = d;
	}
	
	@Override
	public String getDescription() {
		return d.getDescription() + ", Extra Chocolate";
	}

	@Override
	public double cost() {
		return d.cost() + 2.50;
	}

}
