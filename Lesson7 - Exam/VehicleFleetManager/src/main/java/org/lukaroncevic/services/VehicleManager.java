package org.lukaroncevic.services;

import org.lukaroncevic.exceptions.DuplicateVehicleException;
import org.lukaroncevic.exceptions.NoSuchVehicleException;
import org.lukaroncevic.model.Vehicle;

/**
 * VehicleManager Interface with required methods
 *
 * Luka Rončević
 */

public interface VehicleManager {

    void createNewVehicle(Vehicle newVehicle) throws DuplicateVehicleException;

    void deleteVehicleByVin(int vin) throws NoSuchVehicleException;

    void findVehicleByVin(int vin);

    void findVehicleByModel(String model);

    void findVehicleByManufacturer(String manufacturer);

    void listAllVehicles();
}
