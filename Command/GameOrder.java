/**
 * 
 */
package Command;

import GameFactory.GameEmployee;
import org.junit.Test;

/**
 * @author Xavier Gonzalez
 * Class: Object Oriented Development
 * 
 * Command to order games
 */
public class GameOrder implements Command {
	GameEmployee ge;
	String gameType;

	public GameOrder(GameEmployee ge, String type) {
		this.ge = ge;
		this.gameType = type;
		
	}
	
	public void orderUp() {
		ge.setGames(gameType);
		ge.takeOrder();
	}
}
