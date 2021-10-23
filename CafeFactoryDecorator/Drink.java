/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public abstract class Drink {
	String description;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
