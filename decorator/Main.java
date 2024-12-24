package decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent1();
        System.out.println(component.description());

        Component decoratedComponent = new ConcreteDecoratorA(component);
        System.out.println(decoratedComponent.description());

        Component decoratedComponent2 = new ConcreteDecoratorB(decoratedComponent);
        System.out.println(decoratedComponent2.description());
    }
}
