package lt.bit.Savaite4.Task3;

public class Rectangle extends Shape {

    private double widht;
    private double lenght;

    public Rectangle(){
        super();
        widht = 1;
        lenght = 1;
    }

    public Rectangle(String color, boolean isFilled, double widht, double lenght){
        super(color, isFilled);
        this.widht = widht;
        this.lenght = lenght;
    }

    public double getWidht(){
        return widht;
    }

    public double getLenght(){
        return lenght;
    }

    public void setWidht(double widht){
        this.widht = widht;
    }

    public void setLenght(double lenght){
        this.lenght = lenght;
    }

    public double getArea(){
        return lenght * widht;
    }

    public double getPerimeter(){
        return 2 * (lenght + widht);
    }

    public String toString(){
        return String.format("Rectangle with width = %f and length = %f which is a subclass off %s",
                widht, lenght, this.getClass().getSuperclass());
    }
}
