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
public class Submarine extends Ship{
  public Submarine (){
    super("Submarine", 3, 0, 0, false);
  }

    public Submarine (boolean direction, int positionX, int positionY) {
        super("Submarine", direction, 3, positionX, positionY);
    }
}
