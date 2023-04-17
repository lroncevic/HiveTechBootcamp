package org.lukaroncevic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProcessor {

    List<Sale> sales = new ArrayList<>();

    public static double getTotalSales(List<Sale> sales){
        return sales.stream().mapToDouble(Sale::getAmount).sum();
    }

    public static List<Sale> getSalesByRegion(List<Sale> sales, String region){
        return sales.stream()
                .filter(sale -> sale.getRegion().equals(region))
                .collect(Collectors.toList());
    }

    public static List<String> getTopNSalesPerson(List<Sale> sales, int n){
        return sales.stream()
                .collect(Collectors.groupingBy(Sale::getSalesPerson, Collectors.summingDouble(Sale::getAmount)))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(n)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static double getAverageSale(List<Sale> sales){
        return sales.stream().mapToDouble(Sale::getAmount).average().orElse(0);
    }
}
