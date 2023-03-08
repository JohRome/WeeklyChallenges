public class Motorcycle extends Vehicle{
    private boolean windShield;

    public Motorcycle(String brand, String model, float fuelConsumption, int speed, int year, boolean windShield) {
        super(brand, model, fuelConsumption, speed, year);
        this.windShield = windShield;
    }

    @Override
    public float getFuelConsumption() {
        return 0.5f * super.getFuelConsumption();
    }

    @Override
    public int getMaxSpeed() {
        return 2 * super.getMaxSpeed();
    }

    @Override
    public String toString() {
        return "Motorcyle" + "\t\t" + brand + " " + model + "\t\t\t" + (getFuelConsumption());
    }
}
