package battleship;

/**
 *
 * @author Sha
 */
public class Submarine extends Ship {
    public Submarine() {
        super("Submarine", false, 3, 0, 0);
    }

    public Submarine(boolean direction, int positionX, int positionY) {
        super("Submarine", direction, 3, positionX, positionY);
    }
}