public class Output {
    Car car;
    Motorcycle motorcycle;
    Truck truck;
    private int distanceToTravel = 200;
    private float fuelPrice = 19.42F;
    private final float totalPrice = distanceToTravel * fuelPrice;

    public void setDistanceToTravel() {
        this.distanceToTravel = 200;
    }

    public void setFuelPrice() {
        this.fuelPrice = 19.42F;
    }

    public int getDistanceToTravel() {
        return distanceToTravel;
    }

    public float getFuelPrice() {
        return fuelPrice;
    }
    public void printDistanceAndFuel() {
        System.out.println("Distance to travel: " + distanceToTravel + " km" +
                "\nFuel price: " + fuelPrice + " kr/l\n");
    }

    public String printCarInfo() {
        car = new Car("Toyota", "Camry", 7.5F, 220, 2018, 4);
        float fuelPriceToMalmoe = (car.getFuelConsumption() * totalPrice / 100);
        float fuelNeeded = (car.getFuelConsumption()) * (float) (distanceToTravel / 100);
        return
                car.brand + " " + car.model + " (" + car.year + ")" +
                "\nMax speed: " + car.getMaxSpeed() + " km/h" +
                "\nFuel consumption: " + car.getFuelConsumption() + " l/100 km" +
                "\nDoor count: " + car.getDoors() +
                "\nTravel distance: " + distanceToTravel +
                "\nFuel needed: " + fuelNeeded + " l" +
                "\nPrice: " + (float)fuelPriceToMalmoe + " kr";
    }
}
