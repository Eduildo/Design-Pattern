import prototype.RobotPrototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RobotPrototype transporter = new TransporterRobot("Móvel com rodas", "Com caixa de componentes", "com camera");
        RobotPrototype welder = new WelderRobot("Móvel com rodas", "Com caixa de componentes", "com camera");
        RobotPrototype loader = new LoaderRobot("Móvel com esteiras de lagarta", "Com 1 braço", "Sem câmera");

        // Montagem de robôs personalizados
        System.out.println("Robo Transporter personalizado");
        transporter.assemble();
        System.out.println("================================");

        // Clonagem de Robôs personalizados
        RobotPart wheels = new RobotPart("Rodas com jante aluminio");
        System.out.println("Robo transpoter clonado");
        RobotPrototype customRobot = transporter.clone();
        customRobot.setBase(wheels.getName());

        customRobot.assemble();
    }

}
