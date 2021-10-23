/**
 * 
 */
package CafeFactoryDecorator;

/**
 * @author Xavier Gonzalez
 *
 */
public class DrinkFactory {

	public static Drink createDrink(String type) {
		Drink d = null;
		
		if(type.equalsIgnoreCase("Vanilla Shake")) {
			d = new VanillaShake();
		} else if (type.equalsIgnoreCase("Coca Cola")) {
			d = new CocaCola();
		} else if (type.equalsIgnoreCase("Sprite")) {
			d = new Sprite();
		}
		return d;
	}
}
