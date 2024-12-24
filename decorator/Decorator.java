package decorator;

public class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String description() {
        return component.description();
    }
    
}
