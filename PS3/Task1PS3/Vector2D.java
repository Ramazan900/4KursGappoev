package Task1PS3;

/**
 * @author Gappoev Ramazan
 * 01-961
 * Problem Set 3 Task 1
 */

public class Vector2D {
    private double x;
    private double y;

    public Vector2D() {
        this(0, 0);
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D other) {
        return new Vector2D(x + other.x, y + other.y);
    }

    public Vector2D sub(Vector2D other) {
        return new Vector2D(x - other.x, y - other.y);
    }

    public Vector2D mult(double k) {
        return new Vector2D(x * k, y * k);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double scalarProduct(Vector2D other) {
        return x * other.x + y * other.y;
    }
}

