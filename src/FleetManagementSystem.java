class Vehicles{

    public void startEngine(){
        System.out.println("Starting of Vehicle");
    }
}

class Cars extends Vehicles{

    public void startEngine(){
        System.out.println("Car Starting with Key");
    }
}

class Motorcycle extends Vehicles{

    public void startEngine(){
        System.out.println("Motorcycle Starting with button press");
    }
}

class Trucks extends Vehicles{

    public void startEngine(){
        System.out.println("Truck Starting with button press");
    }
}

public class FleetManagementSystem {

    public static void main(String[] args) {

        Vehicles vehicles = new Vehicles();
        vehicles.startEngine();

        Cars cars = new Cars();
        cars.startEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();

        Trucks trucks = new Trucks();
        trucks.startEngine();
    }
}
