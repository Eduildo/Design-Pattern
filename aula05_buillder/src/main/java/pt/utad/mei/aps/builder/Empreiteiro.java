package pt.utad.mei.aps.builder;

public class Empreiteiro {

    private ConstrutorCasa _construtorCasa;

    public Empreiteiro(ConstrutorCasa _construtorCasa) {
        this._construtorCasa = _construtorCasa;
    }

    public Casa getCasa() {
        return _construtorCasa.getCasa();
    }

    public void ConstroiCasa() {
        this._construtorCasa.constroiFundacoes();
        this._construtorCasa.constroiEstrutura();
        this._construtorCasa.constroiCobertura();
        this._construtorCasa.constroiInterior();
    }
}
