package com.jdp.creational.simplefactory;

public class DoorFactory {

    public static Door makeDoor(int width, int height) {
        return new WoodenDoor(width, height);
    }

}
