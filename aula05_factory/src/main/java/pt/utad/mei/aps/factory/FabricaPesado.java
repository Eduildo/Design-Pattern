package pt.utad.mei.aps.factory;

public class FabricaPesado extends FabricaVeiculos {

    @Override
    public Veiculo ConstroVeiculo() {
        return new Pesado();

    }

}
