package pt.utad.mei.aps.abstract_factory;

public class Main {
    public static void main(String[] args) {
        ProdutorVeiculos mercedes = new ProdutorVeiculos(
                new FabricaCombustao());
        Veiculo v = mercedes.ConstroiVeiculos(TipoVeiculo.LIGEIRO);
        v.Show();
        v = mercedes.ConstroiVeiculos(TipoVeiculo.PESADO);
        v.Show();
    }
}