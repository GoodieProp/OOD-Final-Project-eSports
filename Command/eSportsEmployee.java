/**
 * 
 */
package Command;

/**
 * @author Xavier Gonzalez
 *
 */
public class eSportsEmployee {
	Command c;
	
	public void purchase(Command c) {
		this.c = c;
		c.orderUp();
	}


}
