package com.company.neverNull;

import java.time.LocalDate;

public interface Warranty {
    boolean isValidOn(LocalDate date);
}
