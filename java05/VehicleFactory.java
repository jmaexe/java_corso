public class VehicleFactory {

    public static Vehicle createVehicle(String name) {
        switch (name.toLowerCase()) {
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            case "motorcycle":
                return new Motorcycle();
            default:
                return null;
        }
    }
}