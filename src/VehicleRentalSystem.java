import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private List<Vehicle> vehicles;

    public VehicleRentalSystem() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void rentVehicle(String model, LocalDate startDate, LocalDate endDate) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equalsIgnoreCase(model)) {
                vehicle.setAvailable(false);
                Rental rental = new Rental(vehicle, startDate, endDate);
                System.out.println("Rental succesfull!\n" + rental.getRentalDetails());
                return;
            }
        }
        System.out.println("Vehicle not available, or not found");
    }

    public void displayAvailableVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle.getModel() + " (" + vehicle.getType() + ")");
            }
        }
    }
}
