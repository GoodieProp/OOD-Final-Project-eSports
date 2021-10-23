/**
 * 
 */
package Observer;

/**
 * @author Xavier Gonzalez
 *
 */
public class venueMemberCountDisplay implements Observer, DisplayElement{
	
	private int currentMemberCount = 20; // change this to be randomized
	private int previousMemberCount = 15;
	private venueMemberData vmd;
	
	public venueMemberCountDisplay(venueMemberData vmd) {
		this.vmd = vmd;
		vmd.registerObs(this);
	}
	
	public void update(int totalMC) {
		previousMemberCount = currentMemberCount;
		currentMemberCount = totalMC;
		display();
	}
	
	public void display() {
		System.out.println("\n*-----* Total count of Players in Venue! *-----*");
		System.out.println("\nPlayer Count in the Venue: " + currentMemberCount);
	}

}
