package com.company.neverNull;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Demo {

    public void run() {
        // write your code here
        LocalDate sellingDate = LocalDate.now().minus(40, ChronoUnit.DAYS);
        Warranty moneyBack1 = new TimeLimitedWarranty(sellingDate, Duration.ofDays(30));
        Warranty warranty1 = new TimeLimitedWarranty(sellingDate, Duration.ofDays(365));
        Article item1 = new Article(moneyBack1, warranty1);

        this.claimWarranty(item1);
    }

    public void claimWarranty(Article article) {
        LocalDate today = LocalDate.now();
        if (article.getMoneyBackGuarantee().isValidOn(today)) {
            System.out.println("Offer money back");
        }
        if (article.getExpressWarranty().isValidOn(today)) {
            System.out.println("Offer repair.");
        }
        System.out.println("-------------------");
    }

}
