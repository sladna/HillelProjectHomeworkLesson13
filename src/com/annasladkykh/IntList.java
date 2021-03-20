package com.annasladkykh;

/*
Дополнить класс IntList;
Необходимо создать класс аналогичный стандартному ArrayList<Integer> на базе массива.
И реализовать 5 методов:
add - добавить значеине в список
get - получить по индексу
set - заменить по индексу
size - верзнуть размер, изначально 0
toString - красиво печатет список
Логика метода add:
создаем временный массив на 1 елемент больше чем arr, копируем в него все элементы из arr, на последнюю позицию записыаем новый елемент и заменяем arr на временный массив.
 */

import java.util.Arrays;

public class IntList {

    private int[] arr = new int[0];

    public void add(int value) {

        int[] temporaryArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, temporaryArray, 0, arr.length);
        temporaryArray[arr.length] = value;
        arr = temporaryArray;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}