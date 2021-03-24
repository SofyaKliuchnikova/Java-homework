package Homework2;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String[][] stringArray44 = {{"100", "d", "6", ","}, {"3", "7", "+", "2"}, {"100", "3", "6", "5"}, {"3", "20", "e", "2"}};
        String[][] stringArray32 = {{"50", "a"}, {"6", "c"}, {"8", "%"}};

        try {
            summArr(stringArray44);
            summArr(stringArray32);
        } catch (MyArraySizeException e) {
            System.out.println(e);
        }


    }

    public static void summArr(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4 && arr[0].length != 4) {
            throw new MyArraySizeException("Массив не соответствует требованиям!");
        }

        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    String s = arr[i][j];
                    int c = Integer.parseInt(s.trim());
                    summa += c;
                } catch (NumberFormatException ex) {
                    System.out.println("Исключение в ячейке [" + i + "][" + j + "] " + ex.getMessage());
                }
            }
        }

        System.out.println("Результат вычислений: " + summa);
    }
}
