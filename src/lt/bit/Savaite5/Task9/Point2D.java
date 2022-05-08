package lt.bit.Savaite5.Task9;

public class Point2D {
//    Create a
//    Point2D class with fields double x , double y , getters, setters and constructor. Then create a Circle
//    class that will have a constructor:
//    Circle(Point2D center, Point2D point)
//    The first parameter specifies the center of the circle, the second is any point on the circle. Based on these
//    points, the Circle class is to determine:
//    circle radius when calling double getRadius() method
//    circle circumference when calling double getPerimeter() method
//    circle area when calling double getArea() method
//    (challenging) three points on the circle every 90 degrees from the point given when calling the
//    List<Point2D> getSlicePoints() method

    private double x,y;

    public Point2D(double x, double y) {
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
}
