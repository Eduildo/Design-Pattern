package gadget;

public class Client {
    public static void main(String[] args) {
        GadgetPrototype redGadget = new RedGadget();
        GadgetPrototype blueGadget = new BlueGadget();
        GadgetPrototype greenGadget = new GreenGadget();

        // Criação de gadgets usando o padrão Prototype
        GadgetPrototype newRedGadget = redGadget.clone();
        GadgetPrototype newBlueGadget = blueGadget.clone();
        GadgetPrototype newGreenGadget = greenGadget.clone();

        // Verificação das características dos gadgets
        System.out.println("Red Gadget: " + newRedGadget.getColor() + " - " + newRedGadget.getPrize());
        System.out.println("Blue Gadget: " + newBlueGadget.getColor() + " - " + newBlueGadget.getPrize());
        System.out.println("Green Gadget: " + newGreenGadget.getColor() + " - " + newGreenGadget.getPrize());
    }

}
