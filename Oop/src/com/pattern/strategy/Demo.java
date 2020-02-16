package com.pattern.strategy;

public class Demo {
    public static void main(String args []){
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("37346576");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid : "+ amexCard.isValid());
    }
}
