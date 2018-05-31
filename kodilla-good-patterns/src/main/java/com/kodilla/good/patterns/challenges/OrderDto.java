package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public User user;
    public boolean isValid;

    public User getUser() {
        return user;
    }

    public boolean isValid() {
        return isValid;
    }

    public OrderDto(final User user, final boolean isPaid) {
        this.user = user;
        this.isValid = isPaid;
    }
}
