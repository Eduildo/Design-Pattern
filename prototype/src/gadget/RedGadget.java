package gadget;

public class RedGadget extends GadgetPrototype {

    public RedGadget() {
        super("vermelho", "Sem brinde");
    }

    @Override
    public GadgetPrototype clone() {
        return new RedGadget();
    }

}
