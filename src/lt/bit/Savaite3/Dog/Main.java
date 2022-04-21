package lt.bit.Savaite3.Dog;
import lt.bit.Savaite3.Biblioteka.Knyga;
import lt.bit.Savaite3.Dog.Dog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dog firstDog = new Dog("aviganis", 2, "rudas");
        Dog secondDog = new Dog("spanielis", 3, "rudas");
        Dog thirdDog = new Dog("spicas", 1, "baltas");
        Dog fourthDog = new Dog("labradoras", 4, "juodas");
        firstDog.bark();
        firstDog.sleep();

    }

}
