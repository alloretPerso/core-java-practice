package com.pattern.factory.website;

import com.pattern.factory.pages.AboutPage;
import com.pattern.factory.pages.CommentPage;
import com.pattern.factory.pages.ContactPage;
import com.pattern.factory.pages.PostPage;
import com.pattern.factory.Website;

public class Blog extends Website {
    @Override
    public void createWebsites() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new CommentPage());
    }
}
