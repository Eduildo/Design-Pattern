package gadget;

public class GreenGadget extends GadgetPrototype {

    public GreenGadget() {
        super("verde", "Vida extra");
    }

    @Override
    public GadgetPrototype clone() {
        return new GreenGadget();
    }

}
