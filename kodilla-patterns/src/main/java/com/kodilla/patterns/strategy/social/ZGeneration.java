package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User {

    public ZGeneration(String username) {
        super(username);
        networkName = new SnapchatPublisher();
    }
}
