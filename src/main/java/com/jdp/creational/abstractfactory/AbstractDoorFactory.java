package com.jdp.creational.abstractfactory;

class AbstractDoorFactory {

    DoorFactory getDoorFactory(String type) {
        if (type.equals("wood")) {
            return new WoodenDoorFactory();
        } else if (type.equals("iron")) {
            return new IronDoorFactory();
        }
        return null;
    }

}
