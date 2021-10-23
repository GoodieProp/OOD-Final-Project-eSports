/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public class VanillaShake extends Drink {
	
	public VanillaShake() {
		description = "Vanilla Shake with whipped cream.";
	}
	
	public double cost() {
		return 10.00;
	}

}
