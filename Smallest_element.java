package com.day3;

public class Smallest_element {
    public static void main(String[] args) {
        int array[] = {12,200,50,07,20,15};
        int smallest = array[0];
        for (int i=0;i< array.length;i++)
        {
            if(array[i]<smallest)
            {
                smallest=array[i];
            }
        }
        System.out.println("Smallest element of an array is: " +smallest);
    }
}
