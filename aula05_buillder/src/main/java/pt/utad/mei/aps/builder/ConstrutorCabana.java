package pt.utad.mei.aps.builder;

public class ConstrutorCabana implements ConstrutorCasa {
    private Casa _casa;

    public ConstrutorCabana() {
        this._casa = new Casa();
    }

    @Override
    public void constroiFundacoes() {
        this._casa.setFundacoes("Pedras e cimentos");
    }

    @Override
    public void constroiEstrutura() {

        this._casa.setEstrutura("Madeira");
    }

    @Override
    public void constroiCobertura() {
        this._casa.setCobertura("Madeira e peles de animais");

    }

    @Override
    public void constroiInterior() {
        this._casa.setInterior("Lenha e ervas");
    }

    @Override
    public Casa getCasa() {
        return _casa;
    }

}
