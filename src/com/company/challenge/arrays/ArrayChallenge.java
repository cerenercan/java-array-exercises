package com.company.challenge.arrays;

import com.company.arrays.ArrayExamplesOne;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void ArrayChallengeOne(){

        int [] myArray = getIntegers(5);
        System.out.println("The original array: \n");
        ArrayExamplesOne.printArray(myArray);
        System.out.println();
        System.out.println();
        System.out.println("The sorted array: \n");
        ArrayExamplesOne.printArray(sortArray(myArray));
    }

    public static int [] getIntegers(int numberOfElementsInArray){

        System.out.println("Enter " + numberOfElementsInArray + " integer values.\r");
        int [] myArray = new int[numberOfElementsInArray];
        for (int i = 0 ; i < numberOfElementsInArray ; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static int [] sortArray(int [] array){

        int [] sortedArray = Arrays.stream(array).sorted().toArray();

        for( int i = 0; i < sortedArray.length/2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - i - 1];
            sortedArray[sortedArray.length - i - 1] = temp;
        }
        return sortedArray;
    }
}
