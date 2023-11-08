package gadget;

public abstract class GadgetPrototype implements Cloneable {
    private String color;
    private String prize;

    public GadgetPrototype(String color, String prize) {
        this.color = color;
        this.prize = prize;
    }

    public abstract GadgetPrototype clone();

    public String getColor() {
        return color;
    }

    public String getPrize() {
        return prize;
    }

}
