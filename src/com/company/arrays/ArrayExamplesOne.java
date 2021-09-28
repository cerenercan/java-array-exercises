package com.company.arrays;

import java.util.Arrays;

public class ArrayExamplesOne {

    public static void ArrayExamplesBeginning(){

//        Standart definition of an array with 10 integers.
        int [] myIntArray = new int[3];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[1]);
//        System.out.println(myIntArray[2]);
        printArray(myIntArray);

        System.out.println();

//        Defining an array with values.
        int[] myAnotherIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        For every element in myAnotherIntArray loop through.
//        for (int element : myAnotherIntArray) {
//            System.out.println(element);
//        }
        printArray(myAnotherIntArray);
    }

    public static void printArray(int[] array){
//        Manual way of printing an array
//        System.out.print("[");
//        for (int i = 0; i < array.length ; i++){
//            if (i != 0)
//                System.out.print(", ");
//            System.out.print(array[i]);
//        }
//        System.out.print("]");

//        Automatic way of printing an array
        System.out.println(Arrays.toString(array));

//        for (int element : array) {
//            System.out.println(element);
//        }
    }
}
