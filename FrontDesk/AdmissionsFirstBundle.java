package FrontDesk;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * decorator
 */
public class AdmissionsFirstBundle extends Admission{

	public AdmissionsFirstBundle() {
		description = "First Bundle";
	}
	
	public double cost() {
		return 50;
	}

	public Integer drinkVoucher() {
		return null;
	}

	public Integer snackVoucher() {
		return null;
	}

	public Integer gameVoucher() {
		return null;
	}
}
