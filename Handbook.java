package Homework4;

import java.util.HashMap;
import java.util.Map;

public class Handbook {
    private HashMap<Integer, String> hashMap;

    public Handbook(HashMap<Integer, String> hashMap) {
        this.hashMap = hashMap;
    }

    public void add(Integer number, String surname) {
        hashMap.put(number, surname);
    }

    public void get(String surname) {
        for (Map.Entry<Integer, String> item : hashMap.entrySet()) {
            if (item.getValue() == surname) {
                System.out.println(item.getKey() + " - " + item.getValue());
            }
        }
    }
}
