import java.util.Scanner;

public class NumbersRiddle {
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner input = new Scanner(System.in);

        // Wait to get a int or double
        while (!input.hasNextInt() && !input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Please enter either an integer or a double");
        }

        // Depending on input run correct operations
        // NOTICE: This is the strategy if you are going for simplicity;
        //         if I were going for mem optimization I would have two 
        //         different methods with different variable types.

        opOnDouble(Double.parseDouble(input.nextLine()));

        input.close();
    }

    public static void opOnDouble(double input) {
        double operated = input;

        smartPrint("Original", operated);

        // Double number
        operated *= 2;
        smartPrint("Doubled", operated);

        // Add six
        operated += 6;
        smartPrint("Added six", operated);

        // Divide by two
        operated /= 2;
        smartPrint("Divided by two", operated);

        // Subtract original number
        operated -= input;
        smartPrint("Minus original (final)", operated);
    }

    public static void smartPrint(String preoutput, double operated) {
        System.out.print(preoutput + ": ");
        if (operated % 1 == 0) System.out.println((int) operated);
        else System.out.println(operated);
    }
}