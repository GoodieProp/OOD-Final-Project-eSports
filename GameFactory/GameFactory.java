/**
 * 
 */
package GameFactory;

/**
 * @author Xavier Gonzalez
 *
 */
public class GameFactory {

	public Game createGame(String type) {
		Game g = null;
		
		if (type.equals("br")) {
			g = new BattleRoyale();
		} else if (type.equals("fps")) {
			g = new FPSMultiplayer();
		} else if (type.equals("sports")) {
			g = new Sports();
		}
		
		return g;
	}
}
