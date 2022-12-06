package com.unipi.aristeridis;

public enum Katastima {
    INSTANCE("Initial class info");

    private String info;

    private Katastima(String info) {
        this.info = info;
    }

    public Katastima getInstance() {
        return INSTANCE;
    }
}
