package pt.utad.mei.aps.factory;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculos fabrica = new FabricaLigeiro();
        Veiculo v = fabrica.ConstroVeiculo();
        v.Show();

        fabrica = new FabricaPesado();
        v = fabrica.ConstroVeiculo();
        v.Show();

    }
}