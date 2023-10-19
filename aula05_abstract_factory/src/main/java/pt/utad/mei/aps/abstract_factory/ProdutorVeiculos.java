package pt.utad.mei.aps.abstract_factory;

public class ProdutorVeiculos {

    private FabricaVeiculos _fabrica;

    public ProdutorVeiculos(FabricaVeiculos _fabrica) {
        this._fabrica = _fabrica;
    }

    public Veiculo ConstroiVeiculos(TipoVeiculo tipo) {
        return _fabrica.ConstroiVeiculos(tipo);
    }
}
