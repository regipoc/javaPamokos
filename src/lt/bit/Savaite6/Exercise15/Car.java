package lt.bit.Savaite6.Exercise15;
public enum Car {
    FERRARI(3000, 140),
    PORSCHE(2000, 2400),
    MERCEDES(4000, 180);

    private final double price;
    private final int power;

    Car(double price, int power){
        this.price = price;
        this.power = power;
    }

    public boolean isRegular(){
        return this.price < 100000;
    }

    public boolean isPremium(){
        return !isRegular();
    }

    public boolean isFasterThan(Car car){
        return this.power > car.power;
    }
}
