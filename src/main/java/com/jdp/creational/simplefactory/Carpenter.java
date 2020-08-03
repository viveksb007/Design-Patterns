package com.jdp.creational.simplefactory;

class Carpenter {

    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(200, 300);
        System.out.println(door.getHeight());
        System.out.println(door.getWidth());
    }

}
