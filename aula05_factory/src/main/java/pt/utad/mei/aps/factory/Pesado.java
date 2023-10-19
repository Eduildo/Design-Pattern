package pt.utad.mei.aps.factory;

public class Pesado implements Veiculo {

    @Override
    public String getMotor() {
        return "Diesel 4000c 400cv";
    }

    @Override
    public void Show() {
        System.out.println("Pesado" + this.getMotor());
    }

}
