package com.defensivecoding;

import java.util.List;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        List<Integer> ints = List.of(2, 3, 4);
        List<String> strings = List.of("Boston","Washington");

        System.out.println(lambda(ints));
        System.out.println(lambdaWithStrings(strings));
        firstCode();
    }

    public static void firstCode() {

    }

    private static List<Integer> lambda(List<Integer> ints) {
        return ints.stream()
                .filter(x -> x < 4)
                .collect(Collectors.toList());
    }

    private static List<String> lambdaWithStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.equals("Boston"))
                .collect(Collectors.toList());
    }
}
