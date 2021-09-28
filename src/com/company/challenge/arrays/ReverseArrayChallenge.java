package com.company.challenge.arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void printBothArrays(){
        int [] array = new int[] {1, 2, 3, 4, 5};
        System.out.println("Normal Array = " + Arrays.toString(array));
        reverse(array);
    }

    public static void reverse(int [] array){
        for (int i = 0 ; i < array.length / 2 ; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
