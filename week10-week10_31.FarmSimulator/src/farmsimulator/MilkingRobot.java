package farmsimulator;

/**
 * Created by home-folder on 6/20/17.
 */
public class MilkingRobot {

    private BulkTank bulkTank;

    //creates a new milking robot
    public MilkingRobot() {
        this.bulkTank = null;
    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void setBulkTank(BulkTank tank) {
        this.bulkTank = tank;
    }

    public void milk(Milkable milkable) {
        try {
            this.bulkTank.addToTank(milkable.milk());
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
}