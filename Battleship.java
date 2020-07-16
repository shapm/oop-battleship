/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Sha
 */
public class Battleship extends Ship{
  public Battleship (){
    super("Battleship", false, 4, 0, 0);
  }
    public Battleship (boolean direction, int positionX, int positionY) {
        super("Battleship", direction, 4, positionX, positionY);
    }
}
