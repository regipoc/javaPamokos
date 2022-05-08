package lt.bit.Savaite5;

import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        boolean isMatch = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$", Pattern.CASE_INSENSITIVE)
                .matcher("edvinas.scigla@gmail.com")
                .find();


        String tekstas = "edvinas.scigla@gmail.com";
        boolean match = tekstas.matches("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");

        System.out.println(match);
    }
}
