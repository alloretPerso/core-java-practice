package com.pattern.strategy;

public abstract class ValidationStrategy {
    public abstract boolean isValid(CreditCard creditCard);

    protected boolean passesLuhn(String ccNumber) {
        return true;
    }
}
