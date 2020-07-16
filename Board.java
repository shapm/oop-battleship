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
    private int size; //Se declara el tamaño de la matriz
    private Square[][] squares;

    // MÉTODOS - comportamiento
    // constructores
    public Board() {
        this.size = 10; //Sirve de recordatorio de la dimension de la matriz
        this.squares = new Square[size][size];
        for (int i = 0; i < size; i++){
          for (int j = 0; j < size; j++){
            this.squares[i][j] = new Square();
          }
        }
        squares[2][5].setTaken(true);
    }

    public Board(int size) {
        this.size = size;
        this.squares = new Square[size][size];
        // dos for anidados para llenar cada espacio con un new Square
        for (int i = 0; i < size; i++){
          for (int j = 0; j < size; j++){
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
    
  public Square[][] getSquares(){
    return squares;
  }
  public void setSquare(Square[][] squares){
    this.squares = squares; 
  }
  public void print(){
    for(int k = 0; k < squares.length; k++){
        for(int l = 0; l < squares[0].length; l++){
            System.out.print(squares[k][l].toString());
        }
        System.out.println();
    }  
  }
  //print(squares[][]);


}
