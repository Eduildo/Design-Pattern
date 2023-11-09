import prototype.RobotPrototype;

public class TransporterRobot extends RobotPrototype {
    public TransporterRobot(String base, String body, String top) {
        this.base = base;
        this.body = body;
        this.top = top;
    }

    @Override
    public RobotPrototype clone() throws CloneNotSupportedException {
        return (TransporterRobot) super.clone();
    }

}
