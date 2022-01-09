/*
* This program uses the HaokaiStack class
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.Scanner;

/**
* This is the standard "lock" program.
*/
final class Main {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Triangle aStack1 = new Triangle();
        final Scanner userInput1 = new Scanner(System.in);

        System.out.print("Please enter length the A side: ");
        final int aLength = userInput1.nextInt();
        aStack1.setAaSide(aLength);

        System.out.print("Please enter length the B side: ");
        final int bLength = userInput1.nextInt();
        aStack1.setBbSide(bLength);

        System.out.print("Please enter length the C side: ");
        final int cLength = userInput1.nextInt();
        aStack1.setCcSide(cLength);

        if (aStack1.check()) {
            System.out.println("Area: " + aStack1.area()
                             + "\n"
                             + "Perimeter: " + aStack1.perimeter());
            aStack1.putAngles();
            aStack1.type();
        } else {
            System.out.println("This triangle is not valid");
        }

        System.out.println("\nDone.");
    }
}
