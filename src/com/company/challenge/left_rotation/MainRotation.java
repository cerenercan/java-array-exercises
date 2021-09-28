package com.company.challenge.left_rotation;

import java.util.Arrays;

public class MainRotation {

    public static void mainRotationArrayClass(){

        int [] myArray = {1, 2, 3, 4, 5};

        System.out.println("Original array before rotation: ");
        System.out.println(Arrays.toString(myArray));

        LeftRotationArrays leftRotationArrays = new LeftRotationArrays();
        System.out.println("Array after rotation: ");
        System.out.println(Arrays.toString(leftRotationArrays.rotateArray(2, myArray)));
    }
}
