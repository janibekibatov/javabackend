package sabak6;

public class Rectangle {
    int length;
    int width;
    int sides;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public int calculatePerimeter() {
        return 2 * (length) + 2 * (width);
    }
}
