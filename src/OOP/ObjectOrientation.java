package OOP;

import java.util.Random;
import java.util.Scanner;

public class ObjectOrientation {
    public static void main(String[] args) {
        Car car = new Car("Opel", "Astra", 2020);
//        car.year = 2020;
//        car.brand = "Opel";
//        car.model = "Astra";
        car.fuel = 20;
        car.color = "Blue";


        System.out.println(car.brand);
        car.accelerate();
        car.turnRight();
        car.decelerate();

        int range = car.getRange();
        System.out.println("Range: " + range + "km");
        if (range <= 20) {
            System.out.println("Fuel alert!");
        }

        Car car1 = new Car();
        System.out.println(car1.brand);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.setFuelType("Dizel");
        System.out.println(car1.getFuelType());

        car1.setFuelType("abc");
    }
}
