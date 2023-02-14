// Importing
import java.util.Scanner;
/**
* Get the radius from the user to calculate
* the volume of a sphere.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-14
*/

// Making class
public final class TryCatch {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private TryCatch() {
        throw new IllegalStateException("Utility class.");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {
        // Using scanner to get user input
        System.out.println("What is the radius in centimeters?");
        final Scanner scanner = new Scanner(System.in);
        final String userRadius = scanner.nextLine();
        try {

            // Make user input a double.
            final double radiusDouble = Double.parseDouble(userRadius);
            // Check for valid input.
            if (radiusDouble < 0) {
                System.out.println("This is a negative value.");
            } else if (radiusDouble >= 0) {

                // Calculate
                final double volume = ((4.0 / 3.0) * Math.PI)
                    * Math.pow(radiusDouble, 3);
                // Print volume.
                System.out.println("The total volume is : "
                    + String.format("%.2f", volume) + " cm^3.");
            } else {
                System.out.println("This not a possible input.");
            }

        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid radius!"
                + error.getMessage());
        }
        // Close scanner.
        scanner.close();
    }
}
