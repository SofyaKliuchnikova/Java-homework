package Homework4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // задание 1
        HashMap<Integer, String> stringHashMap = new HashMap<>();
        stringHashMap.put(1, "один");
        stringHashMap.put(2, "пять");
        stringHashMap.put(3, "четыре");
        stringHashMap.put(4, "два");
        stringHashMap.put(5, "шесть");
        stringHashMap.put(6, "пять");
        stringHashMap.put(7, "один");
        stringHashMap.put(8, "три");
        stringHashMap.put(9, "пять");
        stringHashMap.put(10, "три");
        stringHashMap.put(11, "один");
        System.out.println("Массив слов:");
        for (Map.Entry entry : stringHashMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("Список уникальных слов с количеством повторов:");

        HashMap<String, Integer> uniqueHashMap = new HashMap<>();
        for (Map.Entry entry : stringHashMap.entrySet()) {
            //   System.out.println(entry.getValue());
            Integer frequency = uniqueHashMap.get(entry.getValue());
            uniqueHashMap.put((String) entry.getValue(), frequency == null ? 1 : frequency + 1);
        }

        for (Map.Entry entry : uniqueHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------------");
        System.out.println("------------------------");

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        Handbook handbook = new Handbook(hashMap);
        handbook.add(2224433, "Иванов");
        handbook.add(2224444, "Петров");
        handbook.add(2224455, "Куликов");
        handbook.add(2224466, "Иванов");
        handbook.add(2224477, "Пастухов");
        handbook.add(2224488, "Петров");
        handbook.add(2224499, "Иванов");

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("тел. " + entry.getKey() + " фамилия: "
                    + entry.getValue());
        }

        System.out.println("------------------------");
        handbook.get("Петров");
        System.out.println("------------------------");
        handbook.get("Иванов");


    }
}
