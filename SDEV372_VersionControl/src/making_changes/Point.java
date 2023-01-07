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

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Point point = (Point) object;
        return java.lang.Double.compare(point.x, x) == 0 && java.lang.Double.compare(point.y, y) == 0;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}