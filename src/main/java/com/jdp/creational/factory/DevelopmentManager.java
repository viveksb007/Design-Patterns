package com.jdp.creational.factory;

class DevelopmentManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
