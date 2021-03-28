package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringArr = new String[] {"first", "second", "third", "fourth", "fifth"};
        changeArrElements(stringArr, 2, 4);

        System.out.println();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        ArrayList appleList = new ArrayList();
        Box appleBox = new Box(appleList);

        ArrayList orangeList = new ArrayList();
        Box orangeBox = new Box(orangeList);

        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);

        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);

        System.out.println("Вес коробки с яблоками " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами " + orangeBox.getWeight());

        System.out.println("Сравним вес коробок:  " + orangeBox.compare(appleBox));

        ArrayList appleList2 = new ArrayList();
        Box appleBox2 = new Box(appleList2);
        Apple apple3 = new Apple();
        appleBox2.addFruit(apple3);
        System.out.println();
        System.out.println("Вес второй коробки с яблоками " + appleBox2.getWeight());

        appleBox2.pourOver(appleBox);
        System.out.println("Пересыпем яблоки в одну коробку и снова сравним: " + orangeBox.compare(appleBox));
        System.out.println("Вес первой коробки с яблоками " + appleBox.getWeight());
        System.out.println("Вес второй коробки с яблоками " + appleBox2.getWeight());

    }

    public static void changeArrElements(Object[] array, int a, int b) {
        System.out.println(Arrays.toString(array));
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
        System.out.println("Меняем местами элементы " + a + " и " + b);
        System.out.println(Arrays.toString(array));
    }


}
