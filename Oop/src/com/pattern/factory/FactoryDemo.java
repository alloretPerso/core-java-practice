package com.pattern.factory;

public class FactoryDemo {
    public static void main(String args []){
        Website website = WebsiteFactory.getWebsite("blog");
        System.out.println(website.getPages());
        website = WebsiteFactory.getWebsite("shop");
        System.out.println(website.getPages());
    }
}
