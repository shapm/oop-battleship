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
    private Square[][] squares;

    // MÉTODOS - comportamiento
    // constructores
    public Board() {
        size = 0; //Sirve de recordatorio de la dimension de la matriz

    }

    public Board(int size) {
        this.size = size;
        this.squares = new Square[size][size];
        // dos for anidados para llenar cada espacio con un new Square
        for (int i = 0; i <= 10; i++){
          for (int j = 0; j <= 10; j++){
            squares[i][j] = new Square(false);
          }
        }
        
        squares[2][5].setTaken(true);

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
  public void getSquare(){
    return Square[][];
  }
  public void setSquare(){
    This.Square = Square; 
  }



}
