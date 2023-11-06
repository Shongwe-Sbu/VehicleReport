/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclereport;

/**
 *
 * @author shong
 */
// Parent class
class Vehicle {
private String brand;
private String model;

public Vehicle(String brand, String model) {
this.brand = brand;
this.model = model;
}

public String getBrand() {
return brand;
}

public String getModel() {
return model;
}
}

// Child class
class Car extends Vehicle {
private int year;

public Car(String brand, String model, int year) {
super(brand, model);
this.year = year;
}

public int getYear() {
return year;
}
}

public class VehicleReport {
public static void main(String[] args) {
// Create an array of Cars
Car[] cars = new Car[3];
cars[0] = new Car("BMW", "X3", 2020);
cars[1] = new Car("BMW", "M3", 2019);
cars[2] = new Car("BMW", "Z4", 2021);

// Generate a report
System.out.println("Vehicle Report:");
for (Car car : cars) {
System.out.println("Brand: " + car.getBrand());
System.out.println("Model: " + car.getModel());
System.out.println("Year: " + car.getYear());
System.out.println("-------------------");
}
}
}

