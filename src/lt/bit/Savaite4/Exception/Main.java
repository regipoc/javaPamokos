package lt.bit.Savaite4.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

//    public void readFile() throws FileNotFoundException {
//        File file = new File("C:/RandomFolder/hello.txt");
//        InputStream inputStream = new FileInputStream(file);
//    }

    public static void main(String[] args) throws SkaiciuotuvoKlaidos {
        System.out.println(Skaiciuotuvas.division(10, 0));
    }
}

