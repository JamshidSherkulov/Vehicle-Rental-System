import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;

    public Rental(Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = calculateTotalCost();
    }

    public double calculateTotalCost() {
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        return vehicle.calculateRentalCost((int) days);
    }

    public void completeRental() {
        vehicle.setAvailable(true);
    }

    public String getRentalDetails() {
        return "Vehicle: " + vehicle.getModel() + " (" + vehicle.getType() + ")\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate + "\n" +
                "Total Cost: $" + totalCost;
    }
}
