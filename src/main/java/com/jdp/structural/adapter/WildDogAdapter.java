package com.jdp.structural.adapter;

public class WildDogAdapter implements Lion {

    private WildDog wildDog;

    WildDogAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    @Override
    public String roar() {
        return wildDog.bark();
    }
}
