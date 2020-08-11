package com.jdp.creational.singleton;

class PoliticalParty {

    public static void main(String[] args) {
        President p1 = President.getInstance();
        President p2 = President.getInstance();
        System.out.println(p1 == p2);
    }

}
