
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelSystem {
    private List<Room> rooms;
    private List<Reservation> reservations;

    public HotelSystem() {
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        rooms.add(new Room(101, "Single", 100.0, true));
        rooms.add(new Room(102, "Double", 150.0, true));
        rooms.add(new Room(103, "Suite", 300.0, true));
    }

    public List<Room> searchAvailableRooms(String category) {
        return rooms.stream()
                .filter(room -> room.getCategory().equalsIgnoreCase(category) && room.isAvailable())
                .collect(Collectors.toList());
    }

    public Reservation makeReservation(int roomNumber, String guestName, LocalDate checkIn, LocalDate checkOut) {
        Room room = rooms.stream()
                         .filter(r -> r.getRoomNumber() == roomNumber && r.isAvailable())
                         .findFirst().orElse(null);

        if (room == null) {
            System.out.println("Room is not available.");
            return null;
        }

        double totalCost = room.getPricePerNight() * (checkOut.toEpochDay() - checkIn.toEpochDay());
        Payment payment = new Payment(totalCost);

        if (payment.processPayment()) {
            Reservation reservation = new Reservation(room, guestName, checkIn, checkOut);
            reservations.add(reservation);
            room.setAvailability(false);
            System.out.println("Reservation successful!");
            return reservation;
        } else {
            System.out.println("Payment failed.");
            return null;
        }
    }

    public void viewReservations() {
        reservations.forEach(System.out::println);
    }
}
