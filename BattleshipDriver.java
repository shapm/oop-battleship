/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *esto esta raro
 */
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
        Ship destroyer = null;
        System.out.println("Ships: " + Ship.numberOfShips);
        
    }

}
