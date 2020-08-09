package com.jdp.creational.builder;

class Ticket {

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
