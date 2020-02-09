package com.company.neverNull;

import java.time.LocalDate;
import java.util.Optional;

public class Part {
    private LocalDate installmentDate; //Date when the part was installed
    private Optional<LocalDate> defectDetectedOn; //Date when a defect was diagnosed

    public LocalDate getDefectDetectedOn() {
        return defectDetectedOn.get();
    }

    public Part(LocalDate installmentDate) {
        this(installmentDate, Optional.empty());
    }

    public Part(LocalDate installmentDate, Optional<LocalDate> defectDetectedOn) {
        this.installmentDate = installmentDate;
        this.defectDetectedOn = defectDetectedOn;
    }

    public Part defective(LocalDate detectedOn) {
        return new Part(this.installmentDate, Optional.of(detectedOn));
    }

    public Warranty apply(Warranty partWarranty) {
        return this.defectDetectedOn
                .flatMap(date -> partWarranty.filter(date).map(warranty -> Warranty.lifeTime(date)))
                .orElse(Warranty.VOID);
    }
}
