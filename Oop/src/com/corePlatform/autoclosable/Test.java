package com.corePlatform.autoclosable;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    private static List<Integer> list = Arrays.asList(1, 2, 3, 4);

    public static void main(String[] args) {
        System.out.println("Starting");


        System.out.println(process(list).collect(Collectors.toList()));
    }


    public static Stream<Integer> process(List<Integer> values){
        return values.stream().filter(i -> i > 2);
    }
}
