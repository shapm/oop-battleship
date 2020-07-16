package battleship;
/**
 *
 * @author Sha
 */
public class BattleshipDriver {
    public static void main(String[] args) {
    	// Create game object
        BattleshipGame game = new BattleshipGame();
        // DEV print number of ships
        System.out.println("Ships: " + Ship.numberOfShips);
        game.start();
        // TODO destroy a ship, decrease coutner, display n of ships
        System.out.println("Ships: " + Ship.numberOfShips);
    }

}