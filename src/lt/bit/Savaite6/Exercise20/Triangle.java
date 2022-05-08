package lt.bit.Savaite6.Exercise20;

public class Triangle extends Shape{

    private double a,b,c, height;

    public Triangle(double a, double b, double c, double height){
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public double calculateArea() {
        return 0.5 * b * height;
    }
}
