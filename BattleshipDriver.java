package battleship;
/**
 *
 * @author Sha
 */
public class BattleshipDriver{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ships: " + Ship.numberOfShips);
        BattleshipGame game = new BattleshipGame();
        System.out.println("Ships: " + Ship.numberOfShips);
        game.start ();
        // TODO destroy a ship, decrease coutner, display n of ships
        System.out.println("Ships: " + Ship.numberOfShips);
        
    }

}
