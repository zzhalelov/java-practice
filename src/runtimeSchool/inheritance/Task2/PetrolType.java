package runtimeSchool.inheritance.Task2;

public class PetrolType extends VehicleTypeByFuelTypes {
    protected String fuel;

    public String getFuelOfType() {
        return fuel;
    }

    public String getFuelName() {
        return "Some fuel type name";
    }
}