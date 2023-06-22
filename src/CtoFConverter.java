import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Celsius = 0;
        double Fahrenheit = 0;
        double convertedTemp = 0;
        boolean done = false;
        //do while loop

        do { //get user input
            System.out.print("Enter your temperature in Celsius: ");
            if (in.hasNextDouble()) {
                Celsius = in.nextDouble();
                in.nextLine();
                //calculate
                Fahrenheit = Celsius * 1.8;
                convertedTemp = Fahrenheit + 32;
                System.out.println("Your temperature in Fahrenheit: " + convertedTemp);
            } else
            {
                System.out.println("Invalid input.");
            }
            if (Celsius == 100) {
                System.out.println("Your temperature is the boiling point.");
            }
            else if (Celsius == 0) {
                System.out.println("Your temperature is the freezing point.");
            }
        } while (done = false);

        //display output
    }
}



