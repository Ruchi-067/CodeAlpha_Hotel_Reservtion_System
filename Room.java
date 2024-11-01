public class Room {
    private int roomNumber;
    private String category;  // e.g., "Single", "Double", "Suite"
    private double pricePerNight;
    private boolean isAvailable;

    public Room(int roomNumber, String category, double pricePerNight, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() { return roomNumber; }
    public String getCategory() { return category; }
    public double getPricePerNight() { return pricePerNight; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailability(boolean isAvailable) { this.isAvailable = isAvailable; }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + ", Category: " + category + ", Price/Night: " + pricePerNight + ", Available: " + isAvailable;
    }
}
