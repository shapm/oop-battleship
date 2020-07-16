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
    protected String name;
    protected boolean direction;
    protected int size;
    protected int positionX;
    protected int positionY;
    // Default value for number of ships
    public static int numberOfShips = 0;


    public Ship (String name, boolean direction, int size, int positionX, int positionY) {
            this.name = name;
            this.direction = direction;
            this.size = size;
            this.positionX = positionX;
            this.positionY = positionY;
            // Add 1 to number of ships when object is created
            numberOfShips++;
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
    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public static int getNumberOfShips() {
        return numberOfShips;
    }

    public void destroy() {
        Ship.numberOfShips--;
    }

}
