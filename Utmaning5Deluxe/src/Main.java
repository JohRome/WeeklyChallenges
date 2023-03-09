public class Main {
    public static void main(String[] args) {

        var car = new Car("Volvo", "S60", 7.5f, 220, 2018, 4);
        var motorcycle = new Motorcycle("BMW", "R 1200", 4.5f, 250, 2022, true);
        var truck = new Truck("Scania", "R450", 35.0f, 90, 1998, 2, 40);
        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(truck);


    }
}
