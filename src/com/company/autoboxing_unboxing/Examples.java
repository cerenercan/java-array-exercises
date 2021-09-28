package com.company.autoboxing_unboxing;

import java.util.ArrayList;

public class Examples {

    public static void trial(){
        String [] strArray = new String[10];
        int [] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Ceren");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

//        Auto-boxing example
        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0 ; i <= 10 ; i++){
            intArrayList.add(Integer.valueOf(i));
        }

//        Unboxing example
        for (int i = 0 ; i < intArrayList.size() ; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
    }
}
