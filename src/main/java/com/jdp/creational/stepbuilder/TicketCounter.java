package com.jdp.creational.stepbuilder;

import com.jdp.creational.builder.Ticket;

class TicketCounter {

    public static void main(String[] args) {
        Ticket ticket = TicketStepBuilder.builder()
                .from("Sikkim")
                .to("New Delhi")
                .date("9th Aug 2020")
                .name("viveksb007")
                .build();
        System.out.println(ticket);
    }

}
