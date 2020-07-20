package battleship;
/**
 *
 * @author Sha
 */
public class Destroyer extends Ship {
    public Destroyer() {
        super("Destroyer", false, 3, 0, 0);
    }
    public Destroyer(boolean direction, int positionX, int positionY) {
        super("Destroyer", direction, 3, positionX, positionY);
    }
}