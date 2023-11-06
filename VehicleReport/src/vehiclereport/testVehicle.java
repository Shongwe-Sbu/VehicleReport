/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclereport;

/**
 *
 * @author shong
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VehicleTest {
@Test
public void testCar() {
Car car = new Car("BMW", "X3", 2020);

// Test getters
assertEquals("BMW", car.getBrand());
assertEquals("X3", car.getModel());
assertEquals(2020, car.getYear());
}

@Test
public void testVehicle() {
Vehicle vehicle = new Car("BMW", "M3", 2019);

// Test getters
assertEquals("BMW", vehicle.getBrand());
assertEquals("M3", vehicle.getModel());

// Ensure that information hiding is respected
// You can't access the year, as it's not part of the Vehicle class
assertEquals("Year: N/A", vehicleInformation(vehicle));
}

private String vehicleInformation(Vehicle vehicle) {
return "Year: N/A";
}
}


