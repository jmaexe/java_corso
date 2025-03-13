public class Point {
    private double x;

    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static Point fromCartesian(double x, double y) {
        return new Point(x, y);
    }

    public static Point fromPolar(double radius, double angle) {
        return new Point(radius * Math.cos(angle), radius * Math.sin(angle));

    }
}
