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
    public Ship Player;
    public Ship Patrol;
    public Ship Submarine;
    public Ship Battleship;
    public Ship AircraftCarrier;
    public Ship Destroyer;

    public BattleshipGame() {
      board = 0;
      Player = 0;
      Patrol = 0;
      Submarine = 0;
      Battleship = 0;
      AircraftCarrier = 0;
      Destroyer = 0;
}
  
  public void start() {
       System.out.println("Play");
    }

}
