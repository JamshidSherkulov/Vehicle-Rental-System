public class Car extends Vehicle {
    public Car(String model) {
        super(model, "Car");
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 50; // 50 is cost for one day
    }
}
