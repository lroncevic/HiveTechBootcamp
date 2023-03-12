package org.main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        float kilometers = 0;
        float conversionFactor = 0;

        do {
            System.out.print("Enter number of kilometers: ");
            kilometers = scanner.nextFloat();
            if(kilometers < 1){
                System.out.println("Please type positive number.");
            }
        } while (kilometers < 1);

        do {
            System.out.print("Enter conversion factor: ");
            conversionFactor = scanner.nextFloat();
            
            if(conversionFactor > 0) {
                File file = new File("conversion_factor.txt");
                FileWriter writer = new FileWriter(file);
                writer.write(String.valueOf(conversionFactor));
                writer.close();

                FileReader reader = new FileReader("conversion_factor.txt");
                char[] buffer = new char[100];
                reader.read(buffer);
                reader.close();

                String contents = new String(buffer);
                System.out.println("From file, conversion factor is: " + contents.trim());
            }

            if(conversionFactor < 1){
                System.out.println("Please type positive number.");
            }
        } while (conversionFactor < 1);

        int converterKilometers = (int) ((int) kilometers/conversionFactor);
        System.out.println(kilometers + " kilometers is " + converterKilometers + " miles.");
        }

}
