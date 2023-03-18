package org.example;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        String book;
        String author;

        Map<String, String> booksMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your favorite books and authors. Enter 'stop' to finish.");

        do {
            System.out.print("Book title: ");
            book = scanner.nextLine();

            if (book.equals("stop")) {
                break;
            }

            System.out.print("Author name: ");
            author = scanner.nextLine();

            if (author.equals("stop")) {
                break;
            }

            booksMap.put(book, author);

        } while (true);

        // convert Map into Set
        Set<String> collectionSetKeys = new LinkedHashSet<>(booksMap.keySet());
        Set<String> collectionSetValues = new LinkedHashSet<>(booksMap.values());

        // convert Set back into Map
        Map<String, String> newMap = IntStream.range(0, collectionSetKeys.size())
                .boxed()
                .collect(Collectors.toMap(
                        i -> collectionSetKeys.toArray(new String[0])[i],
                        i -> collectionSetValues.toArray(new String[0])[i]
                ));

        //convert new Map into List
        List<Map.Entry<String, String>> list = newMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .toList();

        for (Map.Entry<String, String> entry : list) {
            System.out.println(entry.getKey() + " by " + entry.getValue());
        }
    }
}