package decorator_exemple;

public class AbstractDecorator extends Component {
    protected Component _component;

    public void SetComponent(Component component) {
        component._component = component;
    }

    public void doJob() {
        if (_component != null) {
            _component.doJob();
        }
    }
}
