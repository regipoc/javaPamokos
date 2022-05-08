package lt.bit.Savaite5.NestedInnerPavyzdis;

import java.util.List;

// Outer class
public class Veterinarija {
    // Inner class
    public class Veterinaras {
        private String vardas;
        private String pavarde;

        public Veterinaras(String vardas, String pavarde){
            this.vardas = vardas;
            this.pavarde = pavarde;
        }

        public String getVardas() {
            return vardas;
        }
    }

    // Static nested class
    public static class Sandelys{
        private List<Vaistas> vaistai;

        public Sandelys(List<Vaistas> vaistai){
            this.vaistai = vaistai;
        }

        public List<Vaistas> getVaistai() {
            return vaistai;
        }
    }
}
