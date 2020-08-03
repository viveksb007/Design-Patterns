package com.jdp.creational.abstractfactory;

class Designer {

    public static void main(String[] args) {
        AbstractDoorFactory abstractDoorFactory = new AbstractDoorFactory();
        DoorFactory doorFactory = abstractDoorFactory.getDoorFactory("wood");
        System.out.println(doorFactory.makeDoor().getDescription());
        System.out.println(doorFactory.makeFittingExpert().getDescription());

        doorFactory = abstractDoorFactory.getDoorFactory("iron");
        System.out.println(doorFactory.makeDoor().getDescription());
        System.out.println(doorFactory.makeFittingExpert().getDescription());
    }

}
