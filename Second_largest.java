package com.day3;

public class Second_largest {
    public static void main(String[] args) {
        int temp;
        int[] array ={1,5,7,20,8};
        System.out.println("Entered Numbers are: ");
            for( int i=0;i< args.length;i++){
                for(int j=i+1;j<array.length;j++){
                    if(array[i]>array[j]){
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }

                }
            }
            System.out.println("Second largest number is: "+array[4]);

        }
    }

