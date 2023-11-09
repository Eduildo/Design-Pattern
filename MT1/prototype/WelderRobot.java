import prototype.RobotPrototype;

public class WelderRobot extends RobotPrototype {
    public WelderRobot(String base, String body, String top) {
        this.base = base;
        this.body = body;
        this.top = top;
    }

    @Override
    public RobotPrototype clone() throws CloneNotSupportedException {
        return (WelderRobot) super.clone();
    }

}
