package lt.bit.Savaite6.Exercise21;

import lt.bit.Savaite6.Exercise20.Shape;

public abstract class ThreeDShape extends Shape implements Fillable {

    public abstract double calculateVolume();

    @Override
    public void fill(double volume) {
        double calculatedVolume = calculateVolume();
        if(volume > calculatedVolume){
            System.out.println("will pour too much water into the figure and overflow");
        } else if (volume == calculatedVolume){
            System.out.println("fill the figure with water to the brim");
        } else{
            System.out.println("not pouring enough water");
        }
    }
}