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
public class BundleAdditonalSnacks extends BundleDecorator {
	public BundleAdditonalSnacks(Admission ad) {
		this.ad = ad;
	}
	
	public String getDescription() {
		return ad.getDescription() + ", Extra Snack";
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return ad.cost() + 5.00;
	}
	
	public Integer drinkVoucher() {
		return null;
	}

	public Integer snackVoucher() {
		return ad.snackVoucher() + 1;
	}

	public Integer gameVoucher() {
		return null;
	}
}
