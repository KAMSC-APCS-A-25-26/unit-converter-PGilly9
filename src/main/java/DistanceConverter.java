import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        
        while (run){
            System.out.println("Choose conversion direction: ");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.print("\nEnter your  choice (1, 2, or 3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter distance in miles:  ");
                    double miles = sc.nextDouble();
                    if (miles > 0) {
                        double kilometers = miles * 1.60935;
                        System.out.println("Miles: " + miles);
                        System.out.println("Kilometers: " + kilometers + "\n");
                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter amount of Kilometers:  ");
                    double kilometers = sc.nextDouble();
                    if (kilometers > 0) {
                        double miles = kilometers / 1.60935;
                        System.out.println("Kilometers: " + kilometers);
                        System.out.println("Miles: " + miles + "\n");
                    } else {
                        System.out.println("Invalid Input");
                    }
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