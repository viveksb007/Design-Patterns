package com.jdp.creational.singleton;

class President {

    private static volatile President instance;

    private final String name;

    private President(String name) {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() to get single instance of this class");
        }
        this.name = name;
    }

    public static President getInstance() {
        if (instance == null) {
            synchronized (President.class) {
                if (instance != null) instance = new President("viveksb007");
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

}
