package chapter11;

import java.util.Scanner;
import java.util.InputMismatchException;

public class VoltageLevelsExceptHandling {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int voltageLevel;

        while (scnr.hasNext()) {
            try {
                voltageLevel = scnr.nextInt();

                if (voltageLevel >= 39) {
                    System.out.println("on");
                }
                else if (voltageLevel >= 0 && voltageLevel <= 21) {
                    System.out.println("off");
                }
                else {
                    System.out.println("?");
                }
            }
            catch (InputMismatchException excpt) {
                System.out.println("Input error");
                scnr.next();
            }
        }
    }
}