package com.jdp.creational.factory;

public class PlacementDay {

    public static void main(String[] args) {
        ManagerFactory managerFactory = new ManagerFactory();
        HiringManager manager = managerFactory.getManager("dev");
        manager.takeInterview();

        manager = managerFactory.getManager("marketing");
        manager.takeInterview();
    }

}
