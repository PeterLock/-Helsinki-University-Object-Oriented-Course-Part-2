package movable;

/**
 * Created by home-folder on 6/20/17.
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class Group implements Movable {

    private final List<Movable> groups = new ArrayList<Movable>();

    public void addToGroup(Movable movable) {
        groups.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable org : groups) {
            org.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String group = "";
        for (Movable org : groups) {
            group += org.toString();
            group += '\n';
        }
        return group;
    }
}