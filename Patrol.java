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
public class Patrol extends Ship{
  public Patrol (){
    super("Patrol", 2, 0, 0, false);
  }
    public Patrol (boolean direction, int positionX, int positionY) {
        super("Patrol", direction, 2, positionX, positionY);
    }
}
