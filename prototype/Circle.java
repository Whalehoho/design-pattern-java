package prototype;

// Concrete Prototype: Circle
public class Circle implements Prototype {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius); // Create a new object with the same state
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

