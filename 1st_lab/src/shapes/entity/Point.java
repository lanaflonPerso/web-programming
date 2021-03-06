package shapes.entity;

/**
 * Point class
 */
public class Point implements Shape{
    private double x;
    private double y;

    /**
     *
     * @param x x coordinate
     * @param y y coordinate
     */
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

    public void setX(double x) {
        this.x = x;
    }

    /**
     * compute distance between this point and {@code point}
     * @param point second point
     * @return length between points
     */
    public double distanceBetweenPoint(Point point){
        double distOne = (point.getX() - getX()) * (point.getX() - getX());
        double distSecond = (point.getY() - getY()) * (point.getY() - getY());
        return Math.sqrt( distOne +  distSecond);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) return false;
        return Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                " x=" + x +
                ", y=" + y +
                '}';
    }
}
