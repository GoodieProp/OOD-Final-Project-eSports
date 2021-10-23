package FrontDesk;
/**
 * 
 */

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * decorator
 */
public abstract class BundleDecorator extends Admission {
	public Admission ad;
	public abstract String getDescription();
}
