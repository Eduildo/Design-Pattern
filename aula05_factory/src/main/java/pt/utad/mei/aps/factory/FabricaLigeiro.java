package pt.utad.mei.aps.factory;

public class FabricaLigeiro extends FabricaVeiculos {

    @Override
    public Veiculo ConstroVeiculo() {
        return new Ligeiro();
    }

}
