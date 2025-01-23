public class Bike extends Vehicle {
    public Bike(String model) {
        super(model, "Bike");
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 20; // 20 is cost for one day
    }
}
