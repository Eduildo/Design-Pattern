package pt.utad.mei.aps.abstract_factory;

public class LigeiroElectrico implements Veiculo {

    @Override
    public String getMotor() {
        return "900CV 100KW";
    }

    @Override
    public void Show() {
        System.out.println("Ligeiro Electrico " + this.getMotor());
    }

}
