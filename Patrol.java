package battleship;

/**
 *
 * @author Sha
 */
public class Patrol extends Ship {
    public Patrol() {
        super("Patrol", false, 2, 0, 0);
    }
    public Patrol(boolean direction, int positionX, int positionY) {
        super("Patrol", direction, 2, positionX, positionY);
    }
}