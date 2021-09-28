package com.company.referencevsvalue;

import com.company.arrays.ArrayExamplesOne;

import java.util.Arrays;

public class ReferenceVsValueTypes {

    public static void example(){

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int [] myIntArray = new int[5];
        int [] anotherIntArray = myIntArray;

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        myIntArray[0] = 5;
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 10;

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        modifyArray(myIntArray);

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int [] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
