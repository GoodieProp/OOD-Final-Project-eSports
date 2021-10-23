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
public class BundleAdditonalGames extends BundleDecorator {
	public BundleAdditonalGames(Admission ad) {
		this.ad = ad;
	}
	
	public String getDescription() {
		return ad.getDescription() + ", Extra Game";
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return ad.cost() + 10.00;
	}
	
	public Integer drinkVoucher() {
		return null;
	}

	public Integer snackVoucher() {
		return null;
	}

	public Integer gameVoucher() {
		return ad.gameVoucher() + 1;
	}
}
