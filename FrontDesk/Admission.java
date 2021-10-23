package FrontDesk;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * decorator
 */

public abstract class Admission {
	String description = "";
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
	
	public abstract Integer drinkVoucher();
	public abstract Integer snackVoucher();
	public abstract Integer gameVoucher();
}
