package com.company.arrays;

import java.util.Scanner;

public class ArrayExamplesTwo {

    private static Scanner scanner = new Scanner(System.in);

    public static void ArrayExamples(){

        int [] myIntegers = getIntegers(5);
        ArrayExamplesOne.printArray(myIntegers);
        System.out.println();
        System.out.println("The average of the elements in the array is: " + getAverage(myIntegers));
    }

    public static int [] getIntegers(int numberOfArrayElements){

        System.out.println("Enter " + numberOfArrayElements + " integer values.\r");
        int [] values = new int[numberOfArrayElements];

        for (int i = 0 ; i < values.length ; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int [] array){
        int sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum / (double)array.length;
    }
}
