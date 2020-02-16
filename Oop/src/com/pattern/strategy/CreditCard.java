package com.pattern.strategy;

public class CreditCard {
    private String number;
    private String date;
    private String cvv;

    private ValidationStrategy strategy;

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getCvv() {
        return cvv;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }

    public CreditCard(ValidationStrategy amexStrategy) {
        this.strategy = amexStrategy;
    }

    public void setNumber(String s) {
        this.number = s;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
