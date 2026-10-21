package chapter8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAddRemove {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> myInts = new ArrayList<Integer>();
        int numElem;
        int numOps;
        int i;

        System.out.println("\nEnter initial ArrayList size: ");
        numElem = scnr.nextInt();

        System.out.println("Enter number of ArrayList adds: ");
        numOps = scnr.nextInt();

        System.out.println("  Adding elements to ArrayList...");

        myInts.clear();
        for (i = 0; i < numElem; ++i) {
            myInts.add(new Integer(0));
        }

        System.out.println("done.");
        System.out.println("  Writing to each element...");

        for (i = 0; i < numElem; ++i) {
            myInts.set(i, new Integer(777)); // Any value
        }

        System.out.println("done.");
        System.out.print("  Doing " + numOps + " additions at the end...");

        for (i = 0; i < numOps; ++i) {
            myInts.add(new Integer(888)); // Any value
        }

        System.out.println("done.");
        System.out.println("  Doing " + numOps + " additions at index 0...");

        for (i = 0; i < numOps; ++i) {
            myInts.add(0, new Integer(444));
        }
        System.out.println("done.");
        System.out.println("  Doing " + numOps + " removes...");

        for (i = 0; i < numOps; ++i) {
            myInts.remove(0);
        }

        System.out.println("done.");
    }
}
