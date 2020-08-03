package com.jdp.creational.factory;

class MarketingManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
