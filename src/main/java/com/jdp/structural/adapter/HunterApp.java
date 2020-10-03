package com.jdp.structural.adapter;

public class HunterApp {

    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        hunter.hunt(new AfricanLion());
        hunter.hunt(new AsianLion());

        /* Hunter knows how to hunt Lion, now we want hunter to hunt WildDog
          To hunt WildDog, we need to write an Adapter
         */
        hunter.hunt(new WildDogAdapter(new WildDog()));
    }

}
