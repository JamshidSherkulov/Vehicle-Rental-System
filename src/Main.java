import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VehicleRentalSystem system = new VehicleRentalSystem();

        // Adding vehicles to the system
        system.addVehicle(new Car("Toyota Corolla"));
        system.addVehicle(new Bike("Yamaha R15"));
        system.addVehicle(new Car("Honda Civic"));

        // Display available vehicles
        system.displayAvailableVehicles();

        // Rent a vehicle
        system.rentVehicle("Toyota Corolla", LocalDate.of(2025, 1, 25), LocalDate.of(2025, 1, 28));

        // Display available vehicles after renting
        system.displayAvailableVehicles();
    }
}