package com.unipi.aristeridis;

import java.util.ArrayList;
import java.util.List;

public enum Katastima {
    INSTANCE("Arxiki pliroforia katastimatos");

    private List<String> info=new ArrayList<>();

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    private Katastima(List<String> info) {
        this.info = info;
    }

    public Katastima getInstance() {
        return INSTANCE;
    }
}
