package com.jdp.creational.abstractfactory;

class Carpenter implements DoorFittingExpert {
    @Override
    public String getDescription() {
        return "I am a Carpenter";
    }
}
