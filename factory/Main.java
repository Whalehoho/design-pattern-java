package factory;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator1();
        Product product = creator.creProduct();
        product.operation();
    }
}
