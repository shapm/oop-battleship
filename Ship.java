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
 * Atributos: name, direction, size 
 * Métodos, getName, getDirection, getSize,
 * setName, setDirection, setSize
 * direction: 0 horizontal, 1 vertical
 */
public class Ship {
    private String name;
    private boolean direction;
    private int size;
    private int position;
    // Default value for number of ships
    public static int numberOfShips = 0;
    

    public Ship (String name, boolean direction, int size, int position) {
            this.name = name;
            this.direction = direction;
            this.size = size;
            this.position = position;
            // Add 1 to number of ships when object is created
            Ship.numberOfShips += 1; 
        }
    
    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean getDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public int getNumberOfShips() {
        return numberOfShips;
    }
    
    public void destroy() {
        Ship.numberOfShips--;
    }
}
