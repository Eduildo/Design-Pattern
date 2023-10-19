package pt.utad.mei.aps.abstract_factory;

public class PesadoElectrico implements Veiculo {

    @Override
    public String getMotor() {
        return "200CV 600KW";
    }

    @Override
    public void Show() {
        System.out.println("Pesado Electrico " + this.getMotor());
    }

}
