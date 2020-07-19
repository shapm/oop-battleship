package battleship;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Sha
 *
 */
public class BattleshipGame {
    private Board board;
    private Player player;
    private ArrayList<Ship> ships;

    public BattleshipGame() {
        this.player = new Player();
        this.board = new Board();
        this.ships = new ArrayList<>();
    }

    public BattleshipGame(Player player, int size) {
        // Create board
        this.board = new Board(size);
        // Create player
        this.player = player;
        // Create ships array
        this.ships = new ArrayList<>();
    }

    private void setShips() {
        Random rand = new Random();
        //// Start with aircraft carrier
        boolean direction = getDirection();
        // Declare helper variables
        int posX, posY;
        // If horizontal (from left to right)
        if(!direction){
            // Genereate random position
            posX = rand.nextInt(board.getSize());
            // -5 (aricraft size) to avoid getting out of board
            posY = rand.nextInt(board.getSize() - 5);
            // Set squares as taken
            board.getSquares()[posX][posY].setTaken(true);
            board.getSquares()[posX][posY+1].setTaken(true);
            board.getSquares()[posX][posY+2].setTaken(true);
            board.getSquares()[posX][posY+3].setTaken(true);
            board.getSquares()[posX][posY+4].setTaken(true);
        } else {
            posX = rand.nextInt(board.getSize() - 5);
            posY = rand.nextInt(board.getSize());
            board.getSquares()[posX][posY].setTaken(true);
            board.getSquares()[posX+1][posY].setTaken(true);
            board.getSquares()[posX+2][posY].setTaken(true);
            board.getSquares()[posX+3][posY].setTaken(true);
            board.getSquares()[posX+4][posY].setTaken(true);
        }
        // Create ship with generated data
        ships.add(new AircraftCarrier(direction, posX, posY));
        //// Proceed with Battleship
        // Create helper variable
        boolean shipAdded = false;
        do{
            direction = getDirection();
            if(!direction){
                // Genereate random position
                posX = rand.nextInt(board.getSize());
                // -4 (balttleship size) to avoid getting out of board
                posY = rand.nextInt(board.getSize() - 4);
                // Check if squares are available
                if(!board.getSquares()[posX][posY].isTaken() &&
                    !board.getSquares()[posX][posY+1].isTaken() &&
                    !board.getSquares()[posX][posY+2].isTaken() &&
                    !board.getSquares()[posX][posY+3].isTaken()
                    ){
                    // Set squares as taken
                    board.getSquares()[posX][posY].setTaken(true);
                    board.getSquares()[posX][posY+1].setTaken(true);
                    board.getSquares()[posX][posY+2].setTaken(true);
                    board.getSquares()[posX][posY+3].setTaken(true);
                    shipAdded = true;
                }
            } else {
                posX = rand.nextInt(board.getSize() - 4);
                posY = rand.nextInt(board.getSize());
                if(!board.getSquares()[posX][posY].isTaken() &&
                    !board.getSquares()[posX+1][posY].isTaken() &&
                    !board.getSquares()[posX+2][posY].isTaken() &&
                    !board.getSquares()[posX+3][posY].isTaken()
                    ){
                    board.getSquares()[posX][posY].setTaken(true);
                    board.getSquares()[posX+1][posY].setTaken(true);
                    board.getSquares()[posX+2][posY].setTaken(true);
                    board.getSquares()[posX+3][posY].setTaken(true);
                    shipAdded = true;
                }
            }
        } while(!shipAdded);
        ships.add(new Battleship(direction, posX, posY));
        //// Proceed with Submarine
        shipAdded = false;
        do{
            direction = getDirection();
            if(!direction){
                // Genereate random position
                posX = rand.nextInt(board.getSize());
                // -3 (submarine size) to avoid getting out of board
                posY = rand.nextInt(board.getSize() - 3);
                // Check if squares are available
                if(!board.getSquares()[posX][posY].isTaken() &&
                    !board.getSquares()[posX][posY+1].isTaken() &&
                    !board.getSquares()[posX][posY+2].isTaken()
                    ){
                    // Set squares as taken
                    board.getSquares()[posX][posY].setTaken(true);
                    board.getSquares()[posX][posY+1].setTaken(true);
                    board.getSquares()[posX][posY+2].setTaken(true);
                    shipAdded = true;
                }
            } else {
                posX = rand.nextInt(board.getSize() - 3);
                posY = rand.nextInt(board.getSize());
                if(!board.getSquares()[posX][posY].isTaken() &&
                    !board.getSquares()[posX+1][posY].isTaken() &&
                    !board.getSquares()[posX+2][posY].isTaken()
                    ){
                    board.getSquares()[posX][posY].setTaken(true);
                    board.getSquares()[posX+1][posY].setTaken(true);
                    board.getSquares()[posX+2][posY].setTaken(true);
                    shipAdded = true;
                }
            }
        } while(!shipAdded);
        ships.add(new Submarine(direction, posX, posY));
        //// Proceed with Destroyer
        shipAdded = false;
        do{
            direction = getDirection();
            if(!direction){
                // Genereate random position
                posX = rand.nextInt(board.getSize());
                // -3 (destroyer size) to avoid getting out of board
                posY = rand.nextInt(board.getSize() - 3);
                // Check if squares are available
                if(!board.getSquares()[posX][posY].isTaken() &&
                    !board.getSquares()[posX][posY+1].isTaken() &&
                    !board.getSquares()[posX][posY+2].isTaken()
                    ){
                    // Set squares as taken
                    board.getSquares()[posX][posY].setTaken(true);
                    board.getSquares()[posX][posY+1].setTaken(true);
                    board.getSquares()[posX][posY+2].setTaken(true);
                    shipAdded = true;
                }
            } else {
                posX = rand.nextInt(board.getSize() - 3);
                posY = rand.nextInt(board.getSize());
                if(!board.getSquares()[posX][posY].isTaken() &&
                    !board.getSquares()[posX+1][posY].isTaken() &&
                    !board.getSquares()[posX+2][posY].isTaken()
                    ){
                    board.getSquares()[posX][posY].setTaken(true);
                    board.getSquares()[posX+1][posY].setTaken(true);
                    board.getSquares()[posX+2][posY].setTaken(true);
                    shipAdded = true;
                }
            }
        } while(!shipAdded);
        ships.add(new Destroyer(direction, posX, posY));

        //// Proceed with patrol
        shipAdded = false;
        do{
            direction = getDirection();
            if(!direction){
                // Genereate random position
                posX = rand.nextInt(board.getSize());
                // -2 (patrol size) to avoid getting out of board
                posY = rand.nextInt(board.getSize() - 2);
                // Check if squares are available
                if(!board.getSquares()[posX][posY].isTaken() &&
                    !board.getSquares()[posX][posY+1].isTaken()
                    ){
                    // Set squares as taken
                    board.getSquares()[posX][posY].setTaken(true);
                    board.getSquares()[posX][posY+1].setTaken(true);
                    shipAdded = true;
                }
            } else {
                posX = rand.nextInt(board.getSize() - 2);
                posY = rand.nextInt(board.getSize());
                if(!board.getSquares()[posX][posY].isTaken() &&
                    !board.getSquares()[posX+1][posY].isTaken()
                    ){
                    board.getSquares()[posX][posY].setTaken(true);
                    board.getSquares()[posX+1][posY].setTaken(true);
                    shipAdded = true;
                }
            }
        } while(!shipAdded);
        ships.add(new Patrol(direction, posX, posY));
    }

    private boolean getDirection(){
        // Generate random object
        Random rand = new Random();
        // Return expressed as boolean
        return rand.nextBoolean();
    }

    public void start() {
        // Start Message  
        // Logica de que el usuario pueda continuar jugando hasta que encuentre todos los barcos. 
        // Logica para preguntar al usuario las coordenadas e imprimir si existe un barco en esa posicion
        int posiX = 0;
        int posiY = 1;
        
        System.out.print("Si deseas salir escribe -1 en la coordena en Y");
        
        System.out.println("Play");
        
        while(posiY >= 0 || Ship.numberOfShips == 0);
        {
            
         posiX = Integer.parseInt(JOptionPane.showInputDialog("Dame la coordenada en x: "));
         posiY = Integer.parseInt(JOptionPane.showInputDialog("Dame la coordenada en Y: "));
        
         
        /* if(board.[posiX][posiY]){
             
        System.out.print("Si hay un barco ahi");
        
         
         }
         //Si no hay nada en la casilla seleccionada 
         else{
         System.out.print("No hay un barco ahi");
        
         
         }
        */
        
         
        // Clear board
        //Set Ships
        setShips();
        board.print();
         
        }
        if(posiY < 0){
            
        System.out.println("Game over");
        
        }
        
        else
        System.out.print("Congratulations");
    }
}