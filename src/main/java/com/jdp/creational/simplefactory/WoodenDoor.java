package com.jdp.creational.simplefactory;

class WoodenDoor implements Door {

    private final int width;
    private final int height;

    public WoodenDoor(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
