package com.company.challenge.arrays;

import java.util.Arrays;
import java.util.Scanner;


public class MinimumElementChallenge {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int MIN_NUMBER = Integer.MAX_VALUE;

    public static void challengeSolution(){
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Minimum value of the array is: " + findMin(readIntegers(count)));
    }

    public static int [] readIntegers(int count){
        System.out.println("Enter " + count + " integer values:\r");
        int [] array = new int[count];
        for (int i = 0 ; i < array.length ; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Entered array is: " + Arrays.toString(array));
        return array;
    }

    public static int findMin(int [] array){
        int min = MIN_NUMBER;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
