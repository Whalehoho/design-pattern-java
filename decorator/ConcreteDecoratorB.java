package decorator;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public String description() {
        return super.description() + " decorated with B";
    }
    
}
