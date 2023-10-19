package pt.utad.mei.aps.abstract_factory;

public class Ligeiro implements Veiculo {

    @Override
    public String getMotor() {
        return "Gasolina 900c 120cv";
    }

    @Override
    public void Show() {
        System.out.println("Ligeiro " + this.getMotor());
    }

}
