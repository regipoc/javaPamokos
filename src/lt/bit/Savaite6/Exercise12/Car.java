package lt.bit.Savaite6.Exercise12;

import java.util.List;
import java.util.Objects;

public class Car {

    //    Create a Manufacturer class that will contain fields : name, year of establishment, country. Include all
//    necessary methods and constructor parameters . Implement the hashCode and equals methods
//    Create a Car class that will contain fields : name, model, price, year of manufacture , manufacturer list
//    Manufacturer), and engine type represented as the enum class, e.g . V12, V8, V6, S6, S4, S3). Include all
//    necessary methods and constructor parameters . Implement the hashcode () and equals methods

    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacture, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getPrice(), getPrice()) == 0 && getYearOfManufacture() == car.getYearOfManufacture() && getName().equals(car.getName()) && getModel().equals(car.getModel()) && getManufacturerList().equals(car.getManufacturerList()) && getEngineType() == car.getEngineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getPrice(), getYearOfManufacture(), getManufacturerList(), getEngineType());
    }
}
