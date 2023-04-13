package org.lukaroncevic;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {

    List<T> genericList = new ArrayList<T>();

    public void addItem(T item) {
        genericList.add(item);
    }

    public T getItem(int index) {
         return genericList.get(index);
    }

    public void deleteItem(int index){
        genericList.remove(index);
    }

    public int listAll(){
        int counter = 0;
        for (T element : genericList){
            counter++;
        }
        return counter;
    }

    public String listToString(){
        return genericList.toString();
    }
}

