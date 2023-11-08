package gadget;

public class BlueGadget extends GadgetPrototype {

    public BlueGadget() {
        super("azul", "Pontuação extra");

    }

    @Override
    public GadgetPrototype clone() {
        return new BlueGadget();

    }

}
