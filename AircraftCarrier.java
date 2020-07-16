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
public class AircraftCarrier extends Ship {
  public AircraftCarrier (){
    super("AircraftCarrier", true, 5, 0, 0);
  }
    public AircraftCarrier (boolean direction, int positionX, int positionY) {
            super("AircraftCarrier", direction, 5, positionX, positionY);
        }
}
