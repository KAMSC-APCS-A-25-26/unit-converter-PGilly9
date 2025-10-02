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
        while (run){
            Scanner sc = new Scanner(System.in);
            System.out.println("--- Distance Menu---");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to miles");
            System.out.println("3. Exit");
            System.out.print("Enter A choice:  ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the Amount of Miles:  ");
                    double miles = sc.nextDouble();
                    if (miles > 0) {
                        double kilometers = miles * 1.60935;
                        System.out.println("\n Kilometers is:  " + kilometers);
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
                        System.out.println("\n The amount of Miles is:  " + miles);
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