package com.jdp.creational.stepbuilder;

import com.jdp.creational.builder.Ticket;

public class TicketStepBuilder {

    public static From builder() {
        return new Builder();
    }

    public interface From {
        To from(String from);
    }

    public interface To {
        Date to(String to);
    }

    public interface Date {
        Name date(String date);
    }

    public interface Name {
        Build name(String name);
    }

    public interface Build {
        Ticket build();
    }

    public static class Builder implements From, To, Date, Name, Build {

        private String from;
        private String to;
        private String date;
        private String name;


        @Override
        public To from(String from) {
            this.from = from;
            return this;
        }

        @Override
        public Date to(String to) {
            this.to = to;
            return this;
        }

        @Override
        public Name date(String date) {
            this.date = date;
            return this;
        }

        @Override
        public Build name(String name) {
            this.name = name;
            return this;
        }

        @Override
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

}
