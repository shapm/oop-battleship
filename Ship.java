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

    // Constructor without parameters
    public Ship() {
        this.name = "Ship";
        this.direction = false;
        this.size = 0;
        this.positionX = 0;
        this.positionY = 0;
        numberOfShips++;
    }

    // Constructor with parameters
    public Ship(String name, boolean direction, int size, int positionX, int positionY) {
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
        numberOfShips--;
    }

}