package com.jdp.structural.bridge;

public class Carriers extends WebPage {

    Carriers(Theme theme) {
        super(theme);
    }

    @Override
    String getContent() {
        return "Carriers page in " + theme.getTheme();
    }

}
