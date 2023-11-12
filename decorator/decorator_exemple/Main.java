package decorator_exemple;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern demo");
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorEx_1 concrete_1 = new ConcreteDecoratorEx_1();
        concrete_1.SetComponent(component);
        concrete_1.doJob();

        ConcreteDecoratorEx_2 concrete_2 = new ConcreteDecoratorEx_2();
        concrete_2.SetComponent(concrete_1);
        concrete_2.doJob();

    }

}
