package lt.bit.Savaite6.Exercise20;

public class Hexagon extends Shape {

//    Create an abstract Shape class with the abstract methods calculatePerimeter() for calculating the
//    perimeter and calculateArea() for calculating the area.
//    Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract
//    methods accordingly. Verify the solution correctness.

    private double s;

    public Hexagon(double s){
        this.s = s;
    }

    @Override
    public double calculatePerimeter() {
        return 6*s;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(27) * Math.pow(s, 2)) / 2;
    }
}