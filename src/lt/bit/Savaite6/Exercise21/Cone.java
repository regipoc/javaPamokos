package lt.bit.Savaite6.Exercise21;

public class Cone extends ThreeDShape {

//    Create an abstract 3DShape class that extends the Shape class from the previous task.
//    Add an additional method calculateVolume()
//    Creat Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
//    Verify the solution correctness.

    private double r;
    private double height;

    public Cone(double r, double height){
        this.r = r;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculateVolume() {
        return height * ((double) 1/3) * calculateArea();
    }
}
