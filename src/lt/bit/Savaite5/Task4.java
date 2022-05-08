package lt.bit.Savaite5;

public class Task4 {

    //sukurti klase storage, kuri turetu map, konstuktoriu ir metodus, turetu values ir key


    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("id1", "labas");
        storage.addToStorage("id1", "hello");

        storage.addToStorage("id2", "hello");
        storage.findValues("hello");

    }
}
