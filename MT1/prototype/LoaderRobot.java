import prototype.RobotPrototype;

public class LoaderRobot extends RobotPrototype {
    public LoaderRobot(String base, String body, String top) {
        this.base = base;
        this.body = body;
        this.top = top;
    }

    @Override
    public RobotPrototype clone() throws CloneNotSupportedException {
        return (TransporterRobot) super.clone();

    }

}
