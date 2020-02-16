package com.pattern.factory.website;

import com.pattern.factory.Website;
import com.pattern.factory.pages.CartPage;
import com.pattern.factory.pages.ItemPage;
import com.pattern.factory.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsites() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());

    }
}
