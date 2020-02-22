package com.defensivecoding;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        List<Integer> ints = List.of(2, 3, 4);
        List<String> strings = List.of("Boston", "Washington");

        System.out.println(lambda(ints));
        System.out.println(lambdaWithStrings(strings));

        try {
            checkMyValues("val1", "val2", null);
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
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

    private static boolean checkMyValues(String string1, String string2, Integer intValue) throws IllegalArgumentException {
        if (string1 == null || string2 == null || intValue == null) {
            String msg = String.format("You have provided the following arguments, none of them can be null." +
                    "string1: %s, string2: %s, intValue: %s", string1, string2, intValue);
            throw new IllegalArgumentException(msg);
        }
        return true;
    }

    private boolean isValidString(String s) {
        return s == null || s.trim().isEmpty(); //s.isBlank is better solution
    }

    private boolean isValidEmail(String email) {
        Pattern validEmail =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-z0-9.-]+\\.[A-z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = validEmail.matcher(email);
        return matcher.find();
    }

    private LocalDate convertDate(String date) {
        LocalDate dateLocal;
        try {
            dateLocal = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        } catch (DateTimeException exception) {
            throw new IllegalArgumentException(
                    String.format("Could not parse input date %s, " +
                            "please input a date in format dd-MM-YYYY", date)
            );
        }
        return dateLocal;
    }

}
