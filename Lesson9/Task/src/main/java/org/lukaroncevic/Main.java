package org.lukaroncevic;

public class Main {
    public static void main(String[] args) {

        GenericList<Integer> integerGenericList = new GenericList<>();

        integerGenericList.addItem(1);
        integerGenericList.addItem(2);
        integerGenericList.addItem(3);
        integerGenericList.addItem(4);
        integerGenericList.addItem(5);

        System.out.println("Size of list: " + integerGenericList.listAll());

        System.out.println("First element: " + integerGenericList.getItem( 0) +
                " Last element: " + integerGenericList.getItem(4));

        integerGenericList.deleteItem(3);

        System.out.println("Size of list: " + integerGenericList.listAll());

        System.out.println(integerGenericList.listToString());

        GenericList<String> stringGenericList = new GenericList<>();

        System.out.println("------------");

        stringGenericList.addItem("Luka");
        stringGenericList.addItem("Laura");

        System.out.println(stringGenericList.listToString());
    }
}