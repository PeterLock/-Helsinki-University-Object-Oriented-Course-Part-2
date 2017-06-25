package movable;

/**
 * Created by home-folder on 6/20/17.
 */
public class Organism implements Movable {

    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + this.x + "; " + "y: " + this.y;
    }

    @Override
    public void move(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    /*
    //return the x value
    public int xValue(){
        return this.x;
    }

    //return y value
    public int yValue(){
        return this.y;
    }
    */
}