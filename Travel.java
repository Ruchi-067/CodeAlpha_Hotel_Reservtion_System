
import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ItineraryPlanner itineraryPlanner = new ItineraryPlanner();

        System.out.println("Welcome to the Travel Itinerary Planner!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Destination");
            System.out.println("2. Display Itinerary");
            System.out.println("3. Show Total Budget");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter destination name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter travel date (YYYY-MM-DD): ");
                    String travelDate = scanner.nextLine();

                    System.out.print("Enter preferences (e.g., sightseeing, food, adventure): ");
                    String preferences = scanner.nextLine();

                    System.out.print("Enter estimated cost for this destination: ");
                    double estimatedCost = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    Destination destination = new Destination(name, travelDate, preferences, estimatedCost);
                    itineraryPlanner.addDestination(destination);
                    break;

                case 2:
                    itineraryPlanner.displayItinerary();
                    break;

                case 3:
                    System.out.println("Total Estimated Budget: $" + itineraryPlanner.getTotalBudget());
                    break;

                case 4:
                    System.out.println("Exiting the Travel Itinerary Planner. Safe travels!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
