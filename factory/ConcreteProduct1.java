package factory;

public class ConcreteProduct1 extends Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProduct1.operation()");
    }
    
    public void operation1() {
        System.out.println("ConcreteProduct1.operation1()");
    }
}
