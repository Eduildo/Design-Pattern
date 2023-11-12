package decorator_exemple;

public class ConcreteDecoratorEx_2 extends AbstractDecorator {
    public void doJob() {
        System.out.println("");
        System.out.println("Start exemple 2");
        super.doJob();
        System.out.println("Explicitly From DecoratorEx_2");
        System.out.println("End exemple 2");
    }

}
