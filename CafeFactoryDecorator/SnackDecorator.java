/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public abstract class SnackDecorator extends Snack{
	public Snack s;
	public abstract String getDescription();
}
