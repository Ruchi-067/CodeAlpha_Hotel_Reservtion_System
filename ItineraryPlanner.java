
    
import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner {
    private List<Destination> destinations;
    private double totalBudget;

    public ItineraryPlanner() {
        destinations = new ArrayList<>();
        totalBudget = 0.0;
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
        totalBudget += destination.getEstimatedCost();
        System.out.println("Added " + destination.getName() + " to itinerary.");
    }

    public void displayItinerary() {
        System.out.println("\n--- Travel Itinerary ---");
        for (Destination destination : destinations) {
            System.out.println(destination);
            System.out.println("Weather Info: " + destination.getWeatherInfo());
            System.out.println("Map Link: " + destination.getMapLink() + "\n");
        }
        System.out.println("Total Estimated Budget: $" + totalBudget);
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}

