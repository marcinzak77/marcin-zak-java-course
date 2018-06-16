package com.kodilla.patterns.strategy.social;

public class User {

    private final String username;
    protected SocialPublisher networkName;

    public User(String username) {
        this.username = username;
    }

    public String sharePost(String post) {
        return networkName.share(post);
    }

    public void setPrefferedNetwork(SocialPublisher networkName) {
        this.networkName = networkName;
    }

    public String getUsername() {
        return username;
    }
}
