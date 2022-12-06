package com.unipi.aristeridis;

import java.util.ArrayList;
import java.util.List;

public enum Katastima {
    INSTANCE("Arxiki pliroforia katastimatos");

    private String info="Initial info";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private Katastima(String info) {
        this.info = info;
    }

    public Katastima getInstance() {
        return INSTANCE;
    }
}
