/**
 * 
 */
package Observer;

import java.util.Random;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * Observer pattern that displays to the user the amount of people at the venue.
 * It randomizes to either add or subtract players
 */
public class venueMembers {
	private static Random rand = new Random(System.currentTimeMillis());
	private static venueMemberData vmd = new venueMemberData();
	private static int current = 300;
	private static int randomizer = 15;
	private static int chance = 0;
	
	
	venueMemberCountDisplay vmcd = new venueMemberCountDisplay(vmd);
	
	public static void viewCurrentMemberCount() {
		randomizer = rand.nextInt(30-1);
		chance = rand.nextInt(1);
		if (chance == 0) {
			vmd.setUpdateMC(current-randomizer);
		} else if (chance == 1) {
			vmd.setUpdateMC(current+randomizer);
		} else if (current < 0) {
			vmd.setUpdateMC(50);
		}
	}
}
