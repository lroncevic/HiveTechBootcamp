package org.lukaroncevic.exceptions;

/**
 * Custom exception for Empty Fleet
 *
 */

public class FleetEmptyException extends IllegalArgumentException{

    public FleetEmptyException(String message){
        super(message);
    }
}
