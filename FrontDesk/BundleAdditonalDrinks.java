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
public class BundleAdditonalDrinks extends BundleDecorator{

	public BundleAdditonalDrinks(Admission ad) {
		this.ad = ad;
	}
	
	public String getDescription() {
		return ad.getDescription() + ", Extra Drink";
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return ad.cost() + 5.00;
	}
	
	public Integer drinkVoucher() {
		return ad.drinkVoucher() + 1;
	}

	public Integer snackVoucher() {
		return null;
	}

	public Integer gameVoucher() {
		return null;
	}

}
