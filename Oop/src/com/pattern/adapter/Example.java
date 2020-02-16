package com.pattern.adapter;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String args[]) {
        Integer[] arrayOfInts = new Integer[]{42, 43, 44};
        List<Integer> integerList = Arrays.asList(arrayOfInts);
        System.out.println(integerList);
    }
}
