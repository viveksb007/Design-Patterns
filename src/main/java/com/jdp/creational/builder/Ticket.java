package com.jdp.creational.builder;

import com.jdp.creational.stepbuilder.TicketStepBuilder;

public class Ticket {

    private final String from;
    private final String to;
    private final String date;
    private final String name;

    Ticket(TicketBuilder ticketBuilder) {
        this.from = ticketBuilder.getFrom();
        this.to = ticketBuilder.getTo();
        this.date = ticketBuilder.getDate();
        this.name = ticketBuilder.getName();
    }

    public Ticket(TicketStepBuilder.Builder builder) {
        this.from = builder.getFrom();
        this.to = builder.getTo();
        this.date = builder.getDate();
        this.name = builder.getName();
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
