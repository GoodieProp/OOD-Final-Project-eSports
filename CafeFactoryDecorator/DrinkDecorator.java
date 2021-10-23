/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public abstract class DrinkDecorator extends Drink{
	public Drink d;
	public abstract String getDescription();
}
