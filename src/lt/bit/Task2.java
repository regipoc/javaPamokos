package lt.bit;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("svoris");
        float svoris = scanner.nextFloat();
        System.out.println("ugis centimetrais");
        int ugis = scanner.nextInt();
        double ugisMetrais = (double) ugis / 100;
        double bmi = svoris / Math.pow(ugisMetrais, 2);


        String rezult = bmi >= 18.5 && bmi <= 24.9 ? "BMI optimal" : "BMI not optimal";
        System.out.println(rezult);
//        if (bmi >= 18.5 && bmi <= 24.9) {
//        System.out.println("BMI optimal");
//        }else System.out.println("BMI not optimal");

        }
}
