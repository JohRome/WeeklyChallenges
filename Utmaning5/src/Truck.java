public class Truck extends Vehicle{
    private int doors;
    private int capacity;

    public Truck(String brand, String model, float fuelConsumption, int speed, int year) {
        super(brand, model, fuelConsumption, speed, year);
        this.doors = doors;
        this.capacity = capacity;
    }

    @Override
    public float getFuelConsumption() {
        return 3.5f * super.getFuelConsumption();
    }

    @Override
    public int getMaxSpeed() {
        return  super.getMaxSpeed();
    }

    @Override
    public String toString() {
        return "Truck" + "\t\t\t" + brand + " " + model + "\t\t\t" + (getFuelConsumption());
    }
}
