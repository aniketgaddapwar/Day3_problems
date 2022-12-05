package com.day3;

public class Duplicate_element {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,5,6,7};
        System.out.println("Duplicate element of Array is: ");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j])
                System.out.println(array[j]);
            }
        }
    }
}
