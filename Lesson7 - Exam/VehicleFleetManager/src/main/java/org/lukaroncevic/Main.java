package org.lukaroncevic;

import org.lukaroncevic.exceptions.DuplicateVehicleException;
import org.lukaroncevic.exceptions.FleetEmptyException;
import org.lukaroncevic.exceptions.NoSuchVehicleException;
import org.lukaroncevic.model.Car;
import org.lukaroncevic.model.Truck;
import org.lukaroncevic.services.VehicleManagerImpl;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * This class is simulation of the Vehicle Fleet Manager
 *
 * Luka Rončević
 */

public class Main {
    public static void main(String[] args) {

        VehicleManagerImpl vehicleManager = new VehicleManagerImpl();

        Scanner scanner = new Scanner(System.in);

        Logger logger = Logger.getLogger(Main.class.getName());

        try {
            FileHandler handler = new FileHandler("log.txt");
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            logger.warning("Log file couldn't be made: " + e.getMessage());
        }

        int option;

        do {
            //validating good menu option input
            while (true) {
                System.out.println("Vehicle Fleet Manager System");
                System.out.println("----------------------------");
                System.out.println("1. Add a vehicle to the fleet");
                System.out.println("2. Search for vehicles in the fleet");
                System.out.println("3. Print all vehicles in the fleet");
                System.out.println("4. Delete a vehicle from the fleet");
                System.out.println("5. Quit");
                System.out.println("Enter option: ");

                try {
                    option = scanner.nextInt();
                    if (option < 1 || option > 5) {
                        throw new InputMismatchException();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number from 1 to 5.");
                    scanner.nextLine();
                }
            }

            switch (option) {
                case 1:

                    //validating good vehicles input option
                    String vehicleOption;
                    while (true) {
                        try {
                            System.out.println("What type of vehicle would you like to add?");
                            System.out.println("Enter 'car' or truck'.");
                            System.out.println("Enter 'quit' to quit.");
                            vehicleOption = scanner.next();
                            if(vehicleOption.equals("quit")){
                                break;
                            }
                            else if (vehicleOption.equals("car") || vehicleOption.equals("truck")) {
                                break;

                            } else {
                                throw new InputMismatchException();
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter 'car' or 'truck'.");
                            scanner.nextLine();
                        }
                    }


                    try {
                        //create new car
                        if (vehicleOption.equals("car")) {
                            System.out.print("Enter manufacturer: ");
                            String manufacturer = scanner.next();
                            System.out.print("Enter model: ");
                            String model = scanner.next();

                            //validating good yearOfManufacture input
                            int yearOfManufacture;
                            while (true) {
                                try {
                                    System.out.print("Enter year of manufacture: ");
                                    yearOfManufacture = scanner.nextInt();
                                    if (yearOfManufacture > 0) {
                                        break;
                                    } else {
                                        System.out.println("Enter positive number.");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a number.");
                                    scanner.nextLine();
                                }
                            }
                            System.out.print("Enter color: ");
                            String color = scanner.next();

                            //validating good VIN input
                            int vin;
                            while (true) {
                                try {
                                    System.out.print("Enter VIN: ");
                                    vin = scanner.nextInt();
                                    if (vin > 0) {
                                        break;
                                    } else {
                                        System.out.println("Enter positive number.");
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a number.");
                                    scanner.nextLine();
                                }
                            }
                            System.out.print("Enter fuel type: ");
                            String typeOfFuel = scanner.next();

                            //validating good doorNumber input
                            int doorNumber;
                            while (true) {
                                try {
                                    System.out.print("Enter number of doors: ");
                                    doorNumber = scanner.nextInt();
                                    if (doorNumber > 0) {
                                        break;
                                    } else {
                                        System.out.println("Enter positive number.");
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a number.");
                                    scanner.nextLine();
                                }
                            }
                            System.out.print("Enter body style: ");
                            String bodyStyle = scanner.next();

                            Car car = new Car(manufacturer, model, yearOfManufacture, color, vin, typeOfFuel,
                                    doorNumber, bodyStyle);

                            vehicleManager.createNewVehicle(car);

                        } else if (vehicleOption.equals("truck")){
                            //create new truck
                            System.out.print("Enter manufacturer: ");
                            String manufacturer = scanner.next();
                            System.out.print("Enter model: ");
                            String model = scanner.next();

                            //validating good yearOfManufacture input
                            int yearOfManufacture;
                            while (true) {
                                try {
                                    System.out.print("Enter year of manufacture: ");
                                    yearOfManufacture = scanner.nextInt();
                                    if (yearOfManufacture > 0) {
                                        break;
                                    } else {
                                        System.out.println("Enter positive number.");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a number.");
                                    scanner.nextLine();
                                }
                            }

                            System.out.print("Enter color: ");
                            String color = scanner.next();

                            //validating good VIN input
                            int vin;
                            while (true) {
                                try {
                                    System.out.print("Enter VIN: ");
                                    vin = scanner.nextInt();
                                    if (vin > 0) {
                                        break;
                                    } else {
                                        System.out.println("Enter positive number.");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a number.");
                                    scanner.nextLine();
                                }
                            }
                            System.out.print("Enter fuel type: ");
                            String typeOfFuel = scanner.next();

                            //validating good towingCapacity input
                            int towingCapacity;
                            while (true) {
                                try {
                                    System.out.print("Enter towing capacity: ");
                                    towingCapacity = scanner.nextInt();
                                    if (towingCapacity > 0) {
                                        break;
                                    } else {
                                        System.out.println("Enter positive number.");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input. Please enter a number.");
                                    scanner.nextLine();
                                }
                            }

                            Truck truck = new Truck(manufacturer, model, yearOfManufacture, color, vin, typeOfFuel,
                                    towingCapacity);

                            vehicleManager.createNewVehicle(truck);
                        } else {
                             break;
                        }
                    } catch (DuplicateVehicleException e) {
                        System.out.println(e.getMessage());
                        scanner.nextLine();
                    }
                    break;

                case 2:

                    //checking if there are vehicles in fleet
                    try {
                        if (vehicleManager.vehicles.isEmpty()) {
                            throw new FleetEmptyException("There is no vehicles in the fleet. Please create" +
                                    " a new vehicle.");
                        }
                    } catch (FleetEmptyException e) {
                        logger.severe(e.getMessage());
                        break;
                    }

                    //validating good search option input
                    int searchOption;
                    while (true) {
                        try {
                            System.out.println("How would you like to search for vehicles?");
                            System.out.println("1. Search by manufacturer");
                            System.out.println("2. Search by model");
                            System.out.println("3. Search by VIM");
                            System.out.println("4. Quit");

                            searchOption = scanner.nextInt();
                            if(searchOption == 4 ){
                                break;
                            }
                            else if(searchOption < 1 || searchOption > 4) {
                                throw new InputMismatchException();
                            }
                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number from 1 to 4.");
                            scanner.nextLine();
                        }
                    }

                    if (searchOption == 1) {
                        while (true) {
                            try {
                                System.out.println("Enter manufacturer: ");
                                String manufacturerSearch = scanner.next();
                                vehicleManager.findVehicleByManufacturer(manufacturerSearch);
                                break;
                            } catch (NoSuchVehicleException e) {
                                logger.warning(e.getMessage());
                            }
                        }
                    }

                    if (searchOption == 2) {
                        while (true) {
                            try {
                                System.out.println("Enter model: ");
                                String modelSearch = scanner.next();
                                vehicleManager.findVehicleByModel(modelSearch);
                                break;
                            } catch (NoSuchVehicleException e) {
                                logger.warning(e.getMessage());
                            }
                        }
                    }

                    if (searchOption == 3) {
                        //validating good VIN input
                        while (true) {
                            try {
                                System.out.println("Enter VIN: ");
                                int vinSearch = scanner.nextInt();
                                if (vinSearch > 0) {
                                    vehicleManager.findVehicleByVin(vinSearch);
                                    break;
                                } else {
                                    System.out.println("Enter positive number.");
                                }
                            } catch (NoSuchVehicleException e) {
                                logger.warning(e.getMessage());
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.nextLine();
                            }
                        }
                    }
                    break;

                case 3:

                    //checking if there are vehicles in fleet
                    try {
                        if (vehicleManager.vehicles.isEmpty()) {
                            throw new FleetEmptyException("There is no vehicles in the fleet. Please create" +
                                    " a new vehicle.");
                        }
                    } catch (FleetEmptyException e) {
                        logger.severe(e.getMessage());
                        break;
                    }

                    vehicleManager.listAllVehicles();

                    break;

                case 4:

                    //checking if there are vehicles in fleet
                    try {
                        if (vehicleManager.vehicles.isEmpty()) {
                            throw new FleetEmptyException("There is no vehicles in the fleet. Please create" +
                                    " a new vehicle.");
                        }
                    } catch (FleetEmptyException e) {
                        logger.severe(e.getMessage());
                        break;
                    }

                    while(true){
                        try {
                            System.out.println("Enter '1' to quit.");
                            System.out.println("Enter VIN: ");
                            int vinDelete = scanner.nextInt();
                            if(vinDelete == 1){
                                break;
                            }
                            else if(vinDelete > 0){
                                vehicleManager.deleteVehicleByVin(vinDelete);
                                break;
                            }else {
                                System.out.println("Enter positive number.");
                            }
                        } catch (NoSuchVehicleException e) {
                            logger.warning(e.getMessage());
                            scanner.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.nextLine();
                        }
                    }
            }

        } while (option < 5);

    }
}