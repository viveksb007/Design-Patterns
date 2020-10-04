package com.jdp.structural.bridge;

public class Website {

    /*
    *  Bridge pattern favours composition over inheritance. It decouples another abstraction and pass it as composed object.
    * */
    public static void main(String[] args) {
        Theme darkTheme = new DarkTheme();
        Carriers carriersPage = new Carriers(darkTheme);
        System.out.println(carriersPage.getContent());

        Theme lightTheme = new LightTheme();
        About aboutPage = new About(lightTheme);
        System.out.println(aboutPage.getContent());
    }

}
