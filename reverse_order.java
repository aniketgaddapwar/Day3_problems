package com.day3;

public class reverse_order {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Reverse of array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }


    }
}