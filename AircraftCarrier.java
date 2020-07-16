package battleship;
/**
 *
 * @author Sha
 */
public class AircraftCarrier extends Ship {
    public AircraftCarrier() {
        super("AircraftCarrier", true, 5, 0, 0);
    }

    public AircraftCarrier(boolean direction, int positionX, int positionY) {
        super("AircraftCarrier", direction, 5, positionX, positionY);
    }
}