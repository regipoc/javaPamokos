package lt.bit.Savaite5.Task9;

public class Circle {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        double rezultatasBeSaknies = Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2);
        return Math.sqrt(rezultatasBeSaknies); // cia r
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(), 2);
    }
}
