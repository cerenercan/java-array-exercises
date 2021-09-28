package com.company.challenge.left_rotation;

public class LeftRotationArrays {

    public  int [] rotateArray(int numberOfRotation, int [] myArray){

        int [] myNewArray = new int[myArray.length];

        System.arraycopy(myArray, 0, myNewArray, 0, myArray.length);

        while (numberOfRotation > 0){
            for (int i = 1 ; i < myArray.length ; i++){
                int temp = myNewArray[i - 1];
                myNewArray[i - 1] = myNewArray[i];
                myNewArray[i] = temp;
            }
            numberOfRotation--;
        }
        return myNewArray;
    }
}
