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
      ships[0] =  new Patrol(false,0,0);
      ships[1] = new Submarine(false,0,0);
      ships[2] = new Battleship(false,0,0);
      ships[3] = new AircraftCarrier(false,0,0);
      ships[4] = new Destroyer(false,0,0);
}

  public void start() {
       System.out.println("Play");
       // Clear board
       
       // Assign first ship randomly
       // Generate second ship position, check for conflicts
       // Assign second ship position, repeat
       board.print();
    }

}
