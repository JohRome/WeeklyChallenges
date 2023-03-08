import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Ferrarri", "F50", 2.3F, 350, 1992, 2));
        vehicles.add(new Motorcycle("Harley Davidson", "M3i", 0.5F, 220, 1980, false));
        vehicles.add(new Truck("Volvo", "Scania 1337", 4.0F, 110, 1950));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("___________________________________________________________");
        }

        Output output = new Output();
        output.printDistanceAndFuel();
        System.out.println(output.printCarInfo());

    }
}
