package com.jdp.creational.factory;

abstract class HiringManager {

    abstract protected Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = makeInterviewer();
        System.out.println(interviewer.askQuestions());
    }

}
