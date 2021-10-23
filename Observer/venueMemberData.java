package Observer;

//imports
import java.util.*;


/**
 * @author Xavier Gonzalez
 *
 */
public class venueMemberData {
	private List<Observer> obs;
	private int totalMC;
	
	public venueMemberData() {
		obs = new ArrayList<Observer>();
	}
	
	public void registerObs(Observer o) {
		obs.add(o);
	}
	
	public void removeObs(Observer o) {
		obs.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer ob : obs) {
			ob.update(totalMC);
		}
	}
	
	
	public void updateMC() {
		notifyObservers();
	}
	
	public void setUpdateMC(int totalMC) {
		this.totalMC = totalMC;
		updateMC();
	}
	
	public int getTotalMC() {
		return totalMC;
	}
}
