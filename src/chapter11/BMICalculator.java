package chapter11;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int weightVal = 0;    // User defined weight (lbs)
        int heightVal = 0;    // User defined height (in)
        double bmiCalc;        // Resulting BMI

        try {
            System.out.print("Enter weight (in pounds): ");
            weightVal = scnr.nextInt();

            // Error checking, non-negative weight
            if (weightVal < 0) {
                throw new Exception("Invalid weight.");
            }

            System.out.print("Enter height (in inches): ");
            heightVal = scnr.nextInt();

            // Error checking, non-negative height
            if (heightVal < 0) {
                throw new Exception("Invalid height.");
            }

            bmiCalc = ((double) weightVal /
                    (double) (heightVal * heightVal)) * 703.0f;

            System.out.println("BMI: " + bmiCalc);
        }
        catch (InputMismatchException excpt) {
            System.out.println("Expected a number as input.");
            System.out.println("Cannot compute BMI.");
        }
        catch (Exception excpt) {
            // Prints the error message passed by the throw statement.
            System.out.println(excpt.getMessage());
            System.out.println("Cannot compute BMI.");
        }
    }
}