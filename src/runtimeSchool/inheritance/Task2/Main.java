package runtimeSchool.inheritance.Task2;
//Необходимо спроектировать приложение по размещению объявлений о продаже автомобилей. Функционал пригодится в случае массовой фильтрации объявлений по какому-то искомому типу
//It is necessary to design an application for placing ads for the sale of cars. The functionality is useful in the case of mass filtering of ads by some type of search
public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        adsService.filterByVehicleTypeByPurpose(new TruckType());
        adsService.filterByVehicleTypeByBodyTypes(new SedanType()); // Завершите создание объявления с типом кузова SEDAN
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType()); // Завершите создание объявления с типом топлива PETROL
    }
}