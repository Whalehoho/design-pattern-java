package prototype;

public class Main {
    public static void main(String[] args) {
        // Create a prototype registry
        PrototypeRegistry registry = new PrototypeRegistry();

        // Register prototypes
        registry.registerPrototype("circle", new Circle(5));
        registry.registerPrototype("rectangle", new Rectangle(10, 20));

        // Create clones from prototypes
        Circle clonedCircle = (Circle) registry.getPrototype("circle");
        Rectangle clonedRectangle = (Rectangle) registry.getPrototype("rectangle");

        // Modify clones
        clonedCircle.setRadius(10);
        clonedRectangle.setWidth(15);

        // Print the clones
        System.out.println(clonedCircle); // Circle with radius 10
        System.out.println(clonedRectangle); // Rectangle with width 15 and height 20
    }
}
