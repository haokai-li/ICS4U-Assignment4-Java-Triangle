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
    * The zero.
    */
    private static final int ZERO = 0;
    /**
    * The two hundred.
    */
    private static final int TWOOO = 200;
    /**
    * The five hundred.
    */
    private static final int FIVEOO = 500;
    /**
    * The spare.
    */
    private static final String SPARE = "\n";

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
        final Truck aStack1 = new Truck(TWOOO, TWOOO);
        final Scanner userInput1 = new Scanner(System.in);

        System.out.print(
            "Please enter the License plate number of the truck: "
        );
        final String licensePlateNumber = userInput1.nextLine();
        aStack1.setLicense(licensePlateNumber);

        System.out.print(
            "Please enter the Colour of the truck: "
        );
        final String color = userInput1.nextLine();
        aStack1.setColour(color);

        System.out.println(SPARE
                           + "license Plate Number:  " + aStack1.getLicense()
                           + SPARE
                           + "Colour:  " + aStack1.getColour()
                           + SPARE
                           + "Speed:  " + aStack1.getSpeed()
                           + SPARE
                           + "Max Speed:  " + aStack1.getMaxSpeed()
                           + SPARE);

        System.out.println("\nDone.");
    }
}
