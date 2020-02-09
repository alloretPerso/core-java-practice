package com.company.neverNull;

import java.time.LocalDate;

public class VoidWarranty implements Warranty {

    @Override
    public Warranty on(LocalDate date) {
        return this;
    }

    @Override
    public void claim(Runnable action) {
        //apply the else branch
    }
}
