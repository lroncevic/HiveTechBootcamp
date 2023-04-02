package org.lukaroncevic.exceptions;

/**
 * Custom exception for Duplicate Vehicles
 *
 */

public class DuplicateVehicleException extends IllegalArgumentException{

    public DuplicateVehicleException(String message){
        super(message);
    }
}
