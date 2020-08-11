package com.jdp.creational.singleton;

class President {

    private static President instance;

    private final String name;

    private President(String name) {
        this.name = name;
    }

    public static President getInstance() {
        if (instance == null) {
            instance = new President("viveksb007");
        }
        return instance;
    }

    public String getName() {
        return name;
    }

}
