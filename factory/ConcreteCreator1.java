package factory;

public class ConcreteCreator1 extends Creator {
    @Override
    public ConcreteProduct1 creProduct() {
        return new ConcreteProduct1();
    }
}
