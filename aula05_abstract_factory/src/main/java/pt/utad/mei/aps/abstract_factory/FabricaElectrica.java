package pt.utad.mei.aps.abstract_factory;

public class FabricaElectrica implements FabricaVeiculos {

    @Override
    public Veiculo ConstroiVeiculos(TipoVeiculo tipo) {
        switch (tipo) {
            case LIGEIRO:
                return new LigeiroElectrico();
            case PESADO:
                return new PesadoElectrico();
            default:
                return null;
        }
    }

}
