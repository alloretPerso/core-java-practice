package com.company.neverNull;

public class Article {
    private Warranty moneyBackGuarantee;
    private Warranty expressWarranty;
    private Warranty effectiveExpressWarranty = Warranty.VOID;


    private Article(Warranty moneyBackGuarantee, Warranty expressWarranty, Warranty effectiveExpressWarranty) {
        //Constructor preconditions
        if (moneyBackGuarantee == null) throw new IllegalArgumentException();
        if (expressWarranty == null) throw new IllegalArgumentException();
        this.moneyBackGuarantee = moneyBackGuarantee;
        this.expressWarranty = expressWarranty;
        this.effectiveExpressWarranty = effectiveExpressWarranty;

    }

    public Article(Warranty moneyBackGuarantee, Warranty expressWarranty) {
        this(moneyBackGuarantee, expressWarranty, Warranty.VOID);
    }

    public Warranty getMoneyBackGuarantee() {
        return moneyBackGuarantee;
    }

    public Warranty getExpressWarranty() {
        return effectiveExpressWarranty;
    }

    public Article withVisibleDamage() {
        return new Article(Warranty.VOID, this.expressWarranty, this.effectiveExpressWarranty);
    }

    public Article notOperational() {
        return new Article(this.moneyBackGuarantee, this.expressWarranty, this.expressWarranty);
    }
}
