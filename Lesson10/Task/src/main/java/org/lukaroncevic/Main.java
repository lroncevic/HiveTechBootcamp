package org.lukaroncevic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Sale> sales = new ArrayList<>();

        sales.add(new Sale("Luka", "Slavonija", 270));
        sales.add(new Sale("Laura", "Dalmacija", 300));
        sales.add(new Sale("Luka", "Slavonija", 50));
        sales.add(new Sale("Luka", "Dalmacija", 120));

        System.out.println("Total sales: " + StreamProcessor.getTotalSales(sales));
        System.out.println("Sales in region: " + StreamProcessor.getSalesByRegion(sales, "Slavonija").size());
        System.out.println("Top sales people: " + StreamProcessor.getTopNSalesPerson(sales, 3));
        System.out.println("Average sale: " +StreamProcessor.getAverageSale(sales));
    }
}