import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        boolean run = true;
        while (run){
            Scanner sc = new Scanner(System.in);
            System.out.println("--- Temperature Menu---");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter A choice:  ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the Degrees Fahrenheit:  ");
                    double fahrenheit = sc.nextDouble();
                    if (fahrenheit > 0) {
                        double celsius = (fahrenheit - 32) * 5/9;
                        System.out.println("\n Celsius is:  " + celsius);
                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter Degrees Celsius:  ");
                    double celsius = sc.nextDouble();
                    if (celsius > 0) {
                        double fahrenheit = celsius * 9/5 + 32;
                        System.out.println("\n The Degrees Fahrenheit is:  " + fahrenheit);
                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;
                }
                case 3: {
                    run = false;
                    System.out.println("GoodBye");
                    break;
                }
                default:
                    System.out.println("Invalid Option");
            }

        }

    }
}