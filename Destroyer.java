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
public class Destroyer extends Ship{
  public Destroyer (){
    super("Destroyer", 3, 0, 0, false);
  }
    public Destroyer (boolean direction, int positionX, int positionY) {
        super("Destroyer", direction, 3, positionX, positionY);
    }
}
