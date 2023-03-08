public abstract class Vehicle {
    String brand;
    String model;
    float fuelConsumption;
    int speed;
    int year;

    public Vehicle(String brand, String model, float fuelConsumption, int speed, int year) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.year = year;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }
    public int getMaxSpeed() {
        return speed;
    }
}
