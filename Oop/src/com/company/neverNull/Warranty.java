package com.company.neverNull;

import java.time.LocalDate;
import java.util.Optional;

public interface Warranty {

    Warranty on(LocalDate date); // The filtering API

    default void claim(Runnable action){
        action.run(); //->> the de
        // fault  class don't worry about the call
    };
    Optional<Warranty> filter(LocalDate date);
    Warranty VOID = new VoidWarranty();

    static Warranty lifeTime(LocalDate issuedOn) {
        return new LifeTimeWarranty(issuedOn);
    }
}
