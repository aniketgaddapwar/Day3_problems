package com.day3;

public class Largest_number {
    public static void main(String[] args) {
        int [] array = new int [] {2, 21, 50, 88, 77};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
