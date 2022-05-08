package lt.bit.Savaite4.Task2;

public  class Student extends Person {
    private String typeOfStudy;
    private int yearOfStudy;
    private double studyPrice;

    public Student(String typeOfStudy, String adresas1, int yearOfStudy, double studyPrice) {
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public String getTypeOfStudy() {

        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {

        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {

        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {

        this.yearOfStudy = yearOfStudy;
    }

    public double getStudyPrice() {

        return studyPrice;
    }

    public void setStudyPrice(double studyPrice) {

        this.studyPrice = studyPrice;
    }

    public String toString(){
        return String.format("Vardas: %s, adresas: %s, studiju tipas: %s, studiju metai: %d, kaina studiju: %.2f",
                super.name, super.address, typeOfStudy, yearOfStudy, studyPrice);
    }
}

