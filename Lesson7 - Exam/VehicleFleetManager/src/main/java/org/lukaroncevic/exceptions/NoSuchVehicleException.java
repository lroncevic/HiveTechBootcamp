package org.lukaroncevic.exceptions;

/**
 * Custom exception for Non-existed Vehicle
 *
 * Author: Luka Rončević
 */

public class NoSuchVehicleException extends IllegalArgumentException{

    public NoSuchVehicleException(String message){
        super(message);
    }
}
