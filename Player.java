package battleship;

/**
 *
 * @author Equipo4
 */
public class Player {
    private String name;
    private int score;

    // Constructor w/o parameters
    public Player() {
        this.name = "Player";
        this.score = 0;
    }
    // Constructor with parameters
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Setters & getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
}