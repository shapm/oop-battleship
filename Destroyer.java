package battleship;
/**
 *
 * @author Sha
 */
public class Destroyer extends Ship {
    public Destroyer() {
        super("Destroyer", false, 3, 0, 0);
    }
    
    //sobreescritura 
    public Destroyer(boolean direction, int positionX, int positionY) {
        super("Destroyer", direction, 3, positionX, positionY);
    }
    
    // Ejemplo de sobreescritura 
    public void hola(){
        System.out.println("Esta es la clase del barco destroyer");
    }
}