
import java.time.LocalDate;

public class Reservation {
    private Room room;
    private String guestName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Reservation(Room room, String guestName, LocalDate checkInDate, LocalDate checkOutDate) {
        this.room = room;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Room getRoom() { return room; }
    public String getGuestName() { return guestName; }
    public LocalDate getCheckInDate() { return checkInDate; }
    public LocalDate getCheckOutDate() { return checkOutDate; }

    @Override
    public String toString() {
        return "Reservation for " + guestName + " in Room " + room.getRoomNumber() + 
               " from " + checkInDate + " to " + checkOutDate;
    }
}

