package com.jdp.structural.bridge;

public class About extends WebPage {

    About(Theme theme) {
        super(theme);
    }

    @Override
    String getContent() {
        return "About page in " + theme.getTheme();
    }

}
