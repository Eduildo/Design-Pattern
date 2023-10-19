package pt.utad.mei.aps.builder;

public class Main {
    public static void main(String[] args) {
        ConstrutorCasa hsh = new ConstrutorCabana();
        Empreiteiro bob = new Empreiteiro(hsh);

        bob.ConstroiCasa();

        Casa casa = bob.getCasa();

        System.out.println("O Bob construiu isto : " + casa);
    }
}