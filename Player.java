package battleship;

/**
 *
 * @author Equipo4
 */
public class Player {
    private String name;
    private int score;
    
    // Constructor
    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    // Setters & getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}
