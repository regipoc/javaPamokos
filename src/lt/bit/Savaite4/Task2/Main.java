package lt.bit.Savaite4.Task2;

public class Main {

    public static void main(String[] args) {
        Student student =
                new Student("Vardenis", "adresas1", 2, 4000);

        Lecturer lecturer =
                new Lecturer("Vardenis2", "adresas2", "Matematine analize", 2300.49);

        System.out.println(student);
        System.out.println(lecturer);

        System.out.println(student.getYearOfStudy());
    }
}


