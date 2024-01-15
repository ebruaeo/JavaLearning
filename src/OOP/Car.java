package OOP;

public class Car {
    // Özellikler - properties/data field/attributes
    String brand; // default null
    String model;
    int year; // default 0
    String color = "Black";
    int fuel;

    private String fuelType;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        if (fuelType.equalsIgnoreCase("dizel")
                || fuelType.equalsIgnoreCase("benzin")) {
            this.fuelType = fuelType;
        } else {
            System.out.println("Fuel Type uygun değildir.");
        }
    }

    //? Constructor
    public Car(String carBrand, String carModel, int carYear) {
        brand = carBrand;
        model = carModel;
        year = carYear;
    }

    public Car() {}

    // Ne yapabildiği - methods/behaviors
    public void accelerate() {
        System.out.println("Speeding up");
    }

    public void decelerate() {
        System.out.println("Slowing down");
    }

    public void turnRight() {
        System.out.println("Turning right");
    }

    public void turnLeft() {
        System.out.println("Turning left");
    }

    public int getRange() {
        return fuel*10;
    }
}
