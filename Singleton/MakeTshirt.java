class MakeTshirt {
    private static MakeTshirt makeTshirt;

    private MakeTshirt() {
    }

    public static MakeTshirt getTshirt() {
        if (makeTshirt == null) {
            makeTshirt = new MakeTshirt();
            System.out.println("Your Tshirt is made");
        } else {
            System.out.println("You already has one Tshirt");
            System.out.println("you can have only one");
        }
        return makeTshirt;
    }
}
