package com.pattern.factory;

import java.util.Calendar;
import java.util.Locale;

public class FactoryEveryDay {
    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance(Locale.CANADA_FRENCH);
        System.out.println(calendar1);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
