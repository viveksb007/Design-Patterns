package com.jdp.structural.bridge;

public abstract class WebPage {

    protected Theme theme;

    WebPage(Theme theme) {
        this.theme = theme;
    }

    abstract String getContent();

}
