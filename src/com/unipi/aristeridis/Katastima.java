package com.unipi.aristeridis;

public enum Katastima {
    INSTANCE("Arxiki pliroforia katastimatos");

    private String info;

    private Katastima(String info) {
        this.info = info;
    }

    public Katastima getInstance() {
        return INSTANCE;
    }
}
