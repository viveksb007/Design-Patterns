package com.jdp.creational.factory;

class ManagerFactory {

    HiringManager getManager(String type) {
        if (type.equals("dev")) {
            return new DevelopmentManager();
        } else if (type.equals("marketing")) {
            return new MarketingManager();
        }
        return null;
    }

}
