package com.company.neverNull;

import java.time.LocalDate;

public class Part {
    private LocalDate installmentDate; //Date when the part was installed
    private LocalDate defectDetectedOn; //Date when a defect was diagnosed

    public LocalDate getDefectDetectedOn() {
        return defectDetectedOn;
    }

    public Part(LocalDate installmentDate) {
        this(installmentDate, null);
    }

    public Part(LocalDate installmentDate, LocalDate defectDetectedOn) {
        this.installmentDate = installmentDate;
        this.defectDetectedOn = defectDetectedOn;
    }

    public Part defective(LocalDate detectedOn) {
        return new Part(this.installmentDate, detectedOn);
    }

    public Warranty apply(Warranty partWarranty) {
        return this.defectDetectedOn == null ? Warranty.VOID : Warranty.lifeTime(this.defectDetectedOn);
    }
}
