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
        Scanner sc = new Scanner(System.in);

        while (run){
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice (1, 2, or 3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter temperature in Fahrenheit:  ");
                    double fahrenheit = sc.nextDouble();
                    double celsius = (fahrenheit - 32) * 5/9;
                    System.out.println("\nConversion Results:");
                    System.out.println("Fahrenheit: " + fahrenheit);
                    System.out.println("Celsius: " + celsius + "\n");
                    break;
                }

                case 2: {
                    System.out.print("Enter temperature in Celsius:  ");
                    double celsius = sc.nextDouble();
                    double fahrenheit = celsius * 9/5 + 32;
                    System.out.println("\nConversion Results:");
                    System.out.println("Celsius: " + celsius);
                    System.out.println("Fahrenheit: " + fahrenheit + "\n");
                    break;
                }
                case 3: {
                    run = false;
                    System.out.println("Goodbye!");
                    break;
                }
                default:
                    System.out.println("\nInvalid Option\n");
            }

        }

    }
}