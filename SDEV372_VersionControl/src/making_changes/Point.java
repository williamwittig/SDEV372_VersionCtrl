public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Point point = (Point) object;
        return java.lang.Double.compare(point.x, x) == 0 && java.lang.Double.compare(point.y, y) == 0 && java.lang.Double.compare(point.z, z) == 0;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, z);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}