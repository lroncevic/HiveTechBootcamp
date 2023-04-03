package org.lukaroncevic.services;

import org.lukaroncevic.exceptions.DuplicateVehicleException;
import org.lukaroncevic.exceptions.NoSuchVehicleException;
import org.lukaroncevic.model.Car;
import org.lukaroncevic.model.Truck;
import org.lukaroncevic.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * VehicleManager Implementation with all programming logic
 *
 * Luka Rončević
 */

public class VehicleManagerImpl implements VehicleManager {

    public List<Vehicle> vehicles = new ArrayList<>();

    /**
     *
     * @param newVehicle - passing Vehicle type object (car or truck)
     * @throws DuplicateVehicleException - it will be thrown if there is already a vehicle with the same VIN
     */
    @Override
    public void createNewVehicle(Vehicle newVehicle) throws DuplicateVehicleException {

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin() == newVehicle.getVin()) {
                throw new DuplicateVehicleException("Vehicle with VIN " + newVehicle.getVin() + " already exists.");
            }
        }
        vehicles.add(newVehicle);
        System.out.println("New Vehicle saved.");
    }

    /**
     *
     * @param vin - delete vehicle based on VIN
     *            VIN (Vehicle Identification Number) - unique for each vehicle
     */
    @Override
    public void deleteVehicleByVin(int vin) throws NoSuchVehicleException {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin() == vin) {
                vehicles.remove(vehicle);
                System.out.println("Vehicle with VIN " + vehicle.getVin() + " deleted successfully.");
                return;
            }
        }
        throw new NoSuchVehicleException("Vehicle with VIN " + vin + " not found.");
    }

    /**
     * @param vin - find vehicle based on VIN
     *            VIN (Vehicle Identification Number) - unique for each vehicle
     */
    @Override
    public void findVehicleByVin(int vin) {
        boolean vehicleFound = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin() == vin) {
                System.out.println(vehicle);
                vehicleFound = true;
            }
        }
        if (!vehicleFound) {
            throw new NoSuchVehicleException("Vehicle of VIN " + vin + " not found.");

        }
    }

    /**
     * @param model - find vehicle based on the model
     */
    @Override
    public void findVehicleByModel(String model) {
        boolean vehicleFound = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equals(model)) {
                System.out.println(vehicle);
                vehicleFound = true;
            }
        }
        if (!vehicleFound) {
            throw new NoSuchVehicleException("Vehicle of model " + model + " not found.");

        }
    }

    /**
     * @param manufacturer - find vehicle based on the manufacturer
     */
    @Override
    public void findVehicleByManufacturer(String manufacturer) {
        boolean vehicleFound = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getManufacturer().equals(manufacturer)) {
                System.out.println(vehicle);
                vehicleFound = true;
            }
        }
        if (!vehicleFound) {
            throw new NoSuchVehicleException("Vehicle of manufacturer " + manufacturer + " not found.");

        }
    }

    @Override
    public void listAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
