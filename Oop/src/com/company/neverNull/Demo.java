package com.company.neverNull;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Demo {

    public void run() {
        // write your code here
        LocalDate sellingDate = LocalDate.now().minus(40, ChronoUnit.DAYS);
        Warranty moneyBack1 = new TimeLimitedWarranty(sellingDate, Duration.ofDays(60));
        Warranty warranty1 = new TimeLimitedWarranty(sellingDate, Duration.ofDays(365));
        Article item1 = new Article(moneyBack1, warranty1);

        this.claimWarranty(item1);
        this.claimWarranty(item1.withVisibleDamage());
        this.claimWarranty(item1.notOperational().withVisibleDamage());
        this.claimWarranty(item1.notOperational());

        Article item2 = new Article(Warranty.VOID, Warranty.lifeTime(sellingDate));
        this.claimWarranty(item2);
        this.claimWarranty(item2.withVisibleDamage().notOperational());
    }

    private void offerMoneyBack() {
        System.out.println("Offer money back");
    }

    private void offerRepair() {
        System.out.println("Offer repair");
    }

    public void claimWarranty(Article article) {
        LocalDate today = LocalDate.now();

        article.getMoneyBackGuarantee().on(today).claim(this::offerMoneyBack);
        article.getExpressWarranty().on(today).claim(this::offerRepair);

        System.out.println("-------------------");
    }

}
