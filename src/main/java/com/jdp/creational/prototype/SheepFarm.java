package com.jdp.creational.prototype;

class SheepFarm {

    // Used when we need same object with some different parameter or when creation is costly that cloning
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep jolly = new Sheep("Jolly", "Mountain Sheep");
        Sheep dolly = (Sheep) jolly.clone();
        dolly.setName("Dolly");
        System.out.println(jolly);
        System.out.println(dolly);
    }

}
