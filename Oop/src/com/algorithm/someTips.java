package com.algorithm;

import java.util.Arrays;

public class someTips {
    public static void main (String[] args){
        fillAnArrayWithDefaultValues();
    }

    private static void fillAnArrayWithDefaultValues() {
        String[] array = new String[10];
        array[0] = "Houdini";
        Arrays.fill(array,null);
        System.out.println(array[0]);
    }
}
