package chainOfResponsability;

public class Dispensador implements DispensadorCaixa {
    private double _valor;
    private DispensadorCaixa _proximo;

    public Dispensador(double valor) {
        this._valor = valor;
    }

    @Override
    public void setProximo(DispensadorCaixa proximo) {
        this._proximo = proximo;
    }

    @Override
    public void trocos(double quantia) {
        if (quantia >= _valor) {
            int quantas = (int) (quantia / _valor);
            double restante = quantia - quantas * _valor;

            System.out.println(quantas + "de" + _valor);

            if (restante > 0 && _proximo != null) {
                _proximo.trocos(restante);
            } else {
                if (quantia > 0 && _proximo != null) {
                    _proximo.trocos(quantia);
                }

            }
        }
    }

}
