import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight = in.nextDouble();
        System.out.print("Enter feet: ");
        int feet = in.nextInt();
        System.out.print("Enter inches: ");
        int inches = in.nextInt();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is %.2f\n", bmi);
        System.out.println(
                bmi < 18.5 ? "Underweight" : bmi < 25 ? "Normal" : bmi < 30 ? "Overweight" : "Obese");
    }
}
