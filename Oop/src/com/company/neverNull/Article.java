package com.company.neverNull;

import java.time.LocalDate;
import java.util.Optional;

public class Article {
    private Warranty moneyBackGuarantee;
    private Warranty expressWarranty;
    private Warranty effectiveExpressWarranty;
    private Optional<Part> sensor;
    private Warranty extendedWarranty;


    private Article(Warranty moneyBackGuarantee, Warranty expressWarranty, Warranty effectiveExpressWarranty, Optional<Part> sensor, Warranty extendedWarranty) {
        //Constructor preconditions
        if (moneyBackGuarantee == null) throw new IllegalArgumentException();
        if (expressWarranty == null) throw new IllegalArgumentException();
        this.moneyBackGuarantee = moneyBackGuarantee;
        this.expressWarranty = expressWarranty;
        this.effectiveExpressWarranty = effectiveExpressWarranty;
        this.sensor = sensor;
        this.extendedWarranty = extendedWarranty;

    }

    public Article(Warranty moneyBackGuarantee, Warranty expressWarranty) {
        this(moneyBackGuarantee, expressWarranty, Warranty.VOID, Optional.empty(), Warranty.VOID);
    }

    public Warranty getMoneyBackGuarantee() {
        return moneyBackGuarantee;
    }

    public Warranty getExpressWarranty() {
        return effectiveExpressWarranty;
    }

    public Article withVisibleDamage() {
        return new Article(Warranty.VOID, this.expressWarranty, this.effectiveExpressWarranty, this.sensor, this.extendedWarranty);
    }

    public Article notOperational() {
        return new Article(this.moneyBackGuarantee, this.expressWarranty, this.expressWarranty, this.sensor, this.extendedWarranty);
    }

    public Article install(Part sensor, Warranty extendedWarranty) {
        return new Article(this.moneyBackGuarantee, this.expressWarranty, this.effectiveExpressWarranty, Optional.of(sensor), extendedWarranty);
    }

    public Warranty getExtendedWarranty() {
        /*if (sensor == null) return Warranty.VOID;
        LocalDate detectOn = this.sensor.getDefectDetectedOn();
        if (detectOn == null) return Warranty.VOID;
        return this.extendedWarranty.on(detectOn);*/
        return this.sensor.map(part -> part.apply(this.extendedWarranty)).orElse(Warranty.VOID);
    }

    public Article sensorNotOperational(LocalDate detectedOn) {
        return this.sensor.map(part -> part.defective(detectedOn))
                .map(defective -> this.install(defective,this.extendedWarranty))
                .orElse(this);
    }
}
