package com.jdp.creational.builder;

public class TicketBuilder {

    private String from;
    private String to;
    private String date;
    private String name;

    static TicketBuilder builder() {
        return new TicketBuilder();
    }

    public TicketBuilder from(String from) {
        this.from = from;
        return this;
    }

    public TicketBuilder date(String date) {
        this.date = date;
        return this;
    }

    public TicketBuilder to(String to) {
        this.to = to;
        return this;
    }

    public TicketBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Ticket build() {
        return new Ticket(this);
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
}
