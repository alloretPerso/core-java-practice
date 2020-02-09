package com.company.neverNull;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here

    }
    public void claimWarranty(Article article){
        LocalDate today = LocalDate.now();
        if (article.getMoneyBackGuarantee().isValidOn(today)){
            System.out.println("Offer money back");
        }
        if(article.getExpressWarranty().isValidOn(today)){
            System.out.println("Offer repair.");
        }
        System.out.println("-------------------");
    }

}
