public abstract class Vehicle {
    private String model;
    private String type;
    private boolean isAvailable;

    public Vehicle(String model, String type) {
        this.model = model;
        this.type = type;
        this.isAvailable = true;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract double calculateRentalCost(int days);
}
