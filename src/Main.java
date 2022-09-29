import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsiusTemp = 0;
        double fahrenheitTemp = 0;


        System.out.print("What is the temperature in Celsius? ");
        if (in.hasNextDouble())
        {
            celsiusTemp = in.nextDouble();
            fahrenheitTemp = (celsiusTemp * 9/5) + 32;
            in.nextLine();
            System.out.println("This temperature in Fahrenheit is: " + fahrenheitTemp + " degrees.");
        }
        else
        {
            System.out.print("You entered an invalid input.");
            System.exit(0);
        }
    }
}