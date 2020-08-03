package com.jdp.creational.factory;

public class Developer implements Interviewer {
    @Override
    public String askQuestions() {
        return "Tell me about Design Patterns";
    }
}
