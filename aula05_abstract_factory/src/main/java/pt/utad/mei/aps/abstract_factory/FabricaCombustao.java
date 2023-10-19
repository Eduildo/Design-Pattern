package pt.utad.mei.aps.abstract_factory;

public class FabricaCombustao implements FabricaVeiculos {

    @Override
    public Veiculo ConstroiVeiculos(TipoVeiculo tipo) {
        switch (tipo) {
            case PESADO:
                return new Ligeiro();
            case LIGEIRO:
                return new Pesado();
            default:
                return null;
        }
    }

}
