import java.util.ArrayList;
import java.util.List;

class Car {
    private final String model;
    private final String licensePlate;
    private boolean isAvailable;

    public Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.isAvailable = true;
    }
    public String getModel() {
        return model;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void rent() {
        isAvailable = false;
    }
    public void returnCar() {
        isAvailable = true;
    }
}
class Driver {
    private final String name;

    public Driver(String name) {
        this.name = name;
    }

    public void rentCar(Car car) {
        if (car.isAvailable()) {
            car.rent();
            System.out.println(name + " арендовал автомобиль '" + car.getModel() + "' с номером '" + car.getLicensePlate() + "'");
        } else {
            System.out.println(name + " не может арендовать автомобиль '" + car.getModel() + "' - он недоступен.");
        }
    }

    public void returnCar(Car car) {
        car.returnCar();
        System.out.println(name + " вернул автомобиль '" + car.getModel() + "' с номером '" + car.getLicensePlate() + "'");
    }
}

class CarPark {
    private final List<Car> cars;
    public CarPark() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    public void listAvailableCars() {
        System.out.println("Доступные автомобили:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println("- " + car.getModel() + " (номер: " + car.getLicensePlate() + ")");
            }
        }
    }
    public Car findCarByModel(String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && car.isAvailable()) {
                return car;
            }
        }
        return null;
    }
    public Car findCarByLicensePlate(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equalsIgnoreCase(licensePlate) && car.isAvailable()) {
                return car;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {

        CarPark carPark = getCarPark();
        Car searchedCar = carPark.findCarByModel("Honda Accord");
        if (searchedCar != null) {
            System.out.println("Найден автомобиль: " + searchedCar.getModel() + " (номер: " + searchedCar.getLicensePlate() + ")");
        } else {
            System.out.println("Автомобиль не найден.");
        }
        
        
        searchedCar = carPark.findCarByLicensePlate("DEF456");
        if (searchedCar != null) {
            System.out.println("Найден автомобиль: " + searchedCar.getModel() + " (номер: " + searchedCar.getLicensePlate() + ")");
        } else {
            System.out.println("Автомобиль не найден.");
        }
    }

    private static CarPark getCarPark() {
        CarPark carPark = new CarPark();
        Car car1 = new Car("Toyota Camry", "ABC123");
        Car car2 = new Car("Honda Accord", "XYZ789");
        Car car3 = new Car("Ford Mustang", "DEF456");

        carPark.addCar(car1);
        carPark.addCar(car2);
        carPark.addCar(car3);

        Driver driver1 = new Driver("Алексей");
        Driver driver2 = new Driver("Мария");

        carPark.listAvailableCars();

        driver1.rentCar(car1);
        driver2.rentCar(car1);
        carPark.listAvailableCars();
        driver1.returnCar(car1);

        carPark.listAvailableCars();
        return carPark;
    }
}
