/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Equipo4
 *
 *
 */
public class Square {

    private boolean taken;



    public Square (boolean taken) {
            this.taken= taken;
        }

    // getters & setters
    public boolean getTaken() {
        return taken;
    }
    public boolean setTaken() {
        return taken;
    }

}
