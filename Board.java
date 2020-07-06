/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Equipo4
 */
public class Board {
    // ATRIBUTOS - características
    // Todos los atributos comienzan con minúscula
    private int size; //Se espera declarar una matriz
    private boolean direction;
    
    // MÉTODOS - comportamiento
    // constructores
    public Board() {
        size = 10; //Sirve de recordatorio de la dimension de la matriz
    
    }
    
    public Board(int size, boolean direction) {
        this.size = size;
        this.direction = direction;
    }
    
    // getters & setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean getDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
