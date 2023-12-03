package chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Dispensador d1 = new Dispensador(0.01);
        Dispensador d2 = new Dispensador(0.01);
        Dispensador d3 = new Dispensador(0.05);
        Dispensador d4 = new Dispensador(0.15);
        Dispensador d5 = new Dispensador(0.20);
        Dispensador d6 = new Dispensador(0.5);
        Dispensador d7 = new Dispensador(1.00);
        Dispensador d8 = new Dispensador(2.00);

        d8.setProximo(d7);
        d7.setProximo(d6);
        d6.setProximo(d5);
        d5.setProximo(d4);
        d4.setProximo(d3);
        d3.setProximo(d2);
        d2.setProximo(d1);
        d8.trocos(7.8);

    }

}
