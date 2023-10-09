package inheritance.Task2;

public class DieselType extends VehicleTypeByFuelTypes {
    protected String fuel;

    public String getFuelOfType() {
        return fuel;
    }

    public String getFuelName() {
        return "Some vehicle fuel name";
    }
}