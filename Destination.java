
public class Destination {
    private String name;
    private String travelDate;
    private String preferences;
    private double estimatedCost;

    public Destination(String name, String travelDate, String preferences, double estimatedCost) {
        this.name = name;
        this.travelDate = travelDate;
        this.preferences = preferences;
        this.estimatedCost = estimatedCost;
    }

    public String getName() { return name; }
    public String getTravelDate() { return travelDate; }
    public String getPreferences() { return preferences; }
    public double getEstimatedCost() { return estimatedCost; }

    public String getWeatherInfo() {
        // Simulate weather information
        return "Weather in " + name + " on " + travelDate + " is sunny, 25°C.";
    }

    public String getMapLink() {
        // Simulate map link
        return "Map link for " + name + ": https://maps.example.com/" + name.replace(" ", "+");
    }

    @Override
    public String toString() {
        return "Destination: " + name + "\nDate: " + travelDate + "\nPreferences: " + preferences + "\nEstimated Cost: $" + estimatedCost + "\n";
    }
}
