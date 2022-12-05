package com.day3;

import java.util.Scanner;
import java.util.Arrays;
public class Sorting_Of_array {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter Array Element: ");
        Scanner s=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
            System.out.println("Sorted Elements of array: ");
            for(int b:a){
                System.out.print(b+ " ");
            }

    }
}
