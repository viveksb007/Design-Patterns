package com.jdp.creational.builder;

public class TicketCounter {

    public static void main(String[] args) {
        Ticket ticket = TicketBuilder.builder()
                .from("Sikkim")
                .to("New Delhi")
                .name("viveksb007")
                .date("12 Aug 2019")
                .build();
        System.out.println(ticket);
    }

}
