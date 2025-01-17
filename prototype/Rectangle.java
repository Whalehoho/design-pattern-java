package prototype;

// Concrete Prototype: Rectangle
public class Rectangle implements Prototype {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this.width, this.height); // Create a new object with the same state
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}
