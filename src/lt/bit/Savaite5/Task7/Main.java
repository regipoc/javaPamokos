package lt.bit.Savaite5.Task7;

public class Main {

//    Create a class imitating a weapon magazine. The class should be able to define the size of the magazine
//            using the constructor. Implement the methods:
//    loadBullet(String bullet)
//    bullet)→ adding a cartridge to the magazine, does not allow loading more cartridges
//    than the capacity of the magazine
//    isLoaded()
//    isLoaded()→ returns information about whether the weapon is loaded (at least one cartridge) or not
//    shot()
//    shot()→ each call shots one bullet (prints string value in console) the last loaded cartridge and
//    prepares the next one, loaded before the last one, if there are no more cartridges, it prints "empty
//    magazine" in the console

    public static void main(String[] args) {
        Magazine magazine = new Magazine(2);
        magazine.loadBullet("a");
        magazine.loadBullet("b");
        magazine.shot();
        magazine.shot();
    }
}
