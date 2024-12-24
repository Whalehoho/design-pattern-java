package decorator;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public String description() {
        return super.description() + " decorated with A";
    }
    
}
