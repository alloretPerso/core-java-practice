package com.company;


import java.math.BigDecimal;

public class Currency implements Comparable<Currency> {
    private String symbol;

    public Currency(String symbol) {
        this.symbol = symbol;
    }

    public Money zero() {
        return new Money(BigDecimal.ZERO, this);

    }

    @Override
    public int compareTo(Currency o) {
        return this.symbol.compareTo(o.symbol);
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
