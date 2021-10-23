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
public class AdmissionsSecondBundle extends Admission {

	public AdmissionsSecondBundle() {
		description = "Second Bundle";
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return 500;
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
