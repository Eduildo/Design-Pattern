public abstract class RobotPrototype implements Cloneable {
    protected String base;
    protected String body;
    protected String top;

    public void setBase(String base) {
        this.base = base;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public void assemble() {
        System.out.println("Montagem de robo: " + base + " + " + body + " + " + top);
    }

    public RobotPrototype clone() throws CloneNotSupportedException {
        return (RobotPrototype) super.clone();
    }

}
