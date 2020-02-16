package com.pattern.factory;

import com.pattern.factory.website.Blog;
import com.pattern.factory.website.Shop;

public class WebsiteFactory {
    public static Website getWebsite(String siteType) {
        switch (siteType) {
            case "blog": {
                return new Blog();
            }
            case "shop": {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
