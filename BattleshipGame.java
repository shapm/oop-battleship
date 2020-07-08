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
    public Ship patrol;
    public Ship submarine;
    public Ship battleship;
    public Ship aircraftCarrier;
    public Ship destroyer;

    public BattleshipGame() {
      board = new Board();
      player = new Player("",0);
      patrol = new Ship("Patrol",false,2,0);
      submarine = new Ship("Submarine",false,3,0);
      battleship = new Ship("BattleShip",false,4,0);
      aircraftCarrier = new Ship("Aircraft Carrier",false,5,0);
      destroyer = new Ship("Destroyer",false,3,0);
}
  
  public void start() {
       System.out.println("Play");
    }

}
