package battleship;

/**
 * @author Equipo4
 */
public class Square {
    private boolean taken;

    public Square(){
        this.taken = false;
    }
    
    public Square (boolean taken) {
            this.taken= taken;
        }

    // getters & setters
    public boolean isTaken() {
        return taken;
    }
    public void setTaken(boolean taken) {
       this.taken = taken;
    }

    public String toString() {
        if(taken)
            return "X";
        else
            return ".";
    }
}
