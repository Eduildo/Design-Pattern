public class Main {
    public static void main(String[] args) {
        System.out.println("Making my first instance of make tshirt");
        MakeTshirt tShirt1 = MakeTshirt.getTshirt();
        System.out.println(tShirt1);
        System.out.println("Making my second instance of make tshirt");
        MakeTshirt tShirt2 = MakeTshirt.getTshirt();
        System.out.println(tShirt2);
    }
}