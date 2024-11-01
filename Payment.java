
public class Payment {
    private double amount;
    private boolean isPaid;

    public Payment(double amount) {
        this.amount = amount;
        this.isPaid = false;
    }

    public double getAmount() { return amount; }

    public boolean processPayment() {
        // Simulate payment processing
        isPaid = true; // In a real system, you'd call a payment API here
        return isPaid;
    }
}
