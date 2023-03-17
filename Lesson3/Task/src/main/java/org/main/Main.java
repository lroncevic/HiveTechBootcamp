package org.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = 0;
        int sum = 0;
        String dayName;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();

                switch (number % 7){
                    case 0:
                        dayName = "Sunday";
                        break;
                    case 1:
                        dayName = "Monday";
                        break;
                    case 2:
                        dayName = "Tuesday";
                        break;
                    case 3:
                        dayName = "Wednesday";
                        break;
                    case 4:
                        dayName = "Thursday";
                        break;
                    case 5:
                        dayName = "Friday";
                        break;
                    case 6:
                        dayName = "Saturday";
                        break;
                    default:
                        dayName = "Invalid input.";
                        break;
                }

                System.out.println(dayName);

                if(number == 0){
                    continue;
                }
                else if(number % 2 == 0 && number > 0) {
                    sum += number;
                }
                else{
                    break;
                }

            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }

        } while (number >= 0);

        System.out.println("The sum of even numbers entered is: " + sum);

    }
}
