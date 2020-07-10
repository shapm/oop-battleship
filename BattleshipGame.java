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
public class BattleshipGame{
    /**
     * @param args the command line arguments
     */
    public Board board;
    public Player player;
   Ship [ ] ships;

     public BattleshipGame() {
      board = new Board();
      // Create player with Name, Score
      player = new Player("Demo",0);
      // Create ships with Name, Direction, Size, Position
      ships = new Ship[5];
      ships[0] =  new Ship("Patrol",false,2,0);
      ships[1] = new Ship("Submarine",false,3,0);
      ships[2] = new Ship("Battleship",false,4,0);
      ships[3] = new Ship("Aircraft Carrier",false,5,0);
      ships[4] = new Ship("Destroyer",false,3,0);
}

  public void start() {
       System.out.println("Play");
    }

}
