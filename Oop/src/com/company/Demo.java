package com.company;

public class Demo {
    private void reserve(Money cost) {
        System.out.println("Reserving an item costing" + cost);
    }

    private void buy(Money wallet, Money cost) {
        boolean enoughMoney = wallet.compareTo(cost) >= 0;
        this.reserve(cost);


    }

    public void run() {

    }
}
