/**
 * 
 */
package GameFactory;

import java.util.ArrayList;

import Command.eSportsEmployee;
import CurrentVenueInfo.currentVenueInfo;
import FrontDesk.FrontDeskMenu;

/**
 * @author Xavier Gonzalez
 *
 */
public class GameEmployee {
	private static currentVenueInfo cvi = new currentVenueInfo();
	FrontDeskMenu fdm = new FrontDeskMenu();
	eSportsEmployee esp = new eSportsEmployee();
	int gameVoucher;
	double gameCost;
	String gameType;
	private static ArrayList<String> currentGameSlot = new ArrayList<String>();
	public void setGames(String type) {
		this.gameType = type;
	}
	
	public void takeOrder() {
		Game g;
		GameFactory gf = new GameFactory();
		gameCost = 0;
		gameVoucher = fdm.getGameVouchers();
		if (gameType.equalsIgnoreCase("fps")) {
			g = gf.createGame(gameType);
			if (gameVoucher > 0) {
				gameCost = 0;
				fdm.removeGameVouchers();
				System.out.println("You had a game voucher! Your game order will be free!");
			} else {
				gameCost += g.cost;
			}
			cvi.setItemNames(g.getGameName()); //receipt use
			cvi.setItemPrice(gameCost);
			cvi.setCurrentGameSlot(g.getGameName());
		} else if (gameType.equalsIgnoreCase("br")) {
			g = gf.createGame(gameType);
			if (gameVoucher > 0) {
				gameCost = 0;
				fdm.removeGameVouchers();
				System.out.println("You had a game voucher! Your game order will be free!");
			} else {
				gameCost += g.cost;
			}
			cvi.setItemNames(g.getGameName()); //receipt use
			cvi.setItemPrice(gameCost);
			cvi.setCurrentGameSlot(g.getGameName());
		} else if (gameType.equalsIgnoreCase("sports")) {
			g = gf.createGame(gameType);
			if (gameVoucher > 0) {
				gameCost = 0;
				fdm.removeGameVouchers();
				System.out.println("You had a game voucher! Your game order will be free!");
			} else {
				gameCost += g.cost;
			}
			cvi.setItemNames(g.getGameName()); //receipt use
			cvi.setItemPrice(gameCost);
			cvi.setCurrentGameSlot(g.getGameName());
		}
	}
	
}
