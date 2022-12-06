package com.unipi.aristeridis;

import java.util.Observable;
import java.util.Observer;

public class DiforopoiisiYpologiston extends Pelates implements Observer {
    private String PCinfo;

    @Override
    public void update(Observable o, Object PCinfo) {
        this.setPCinfo((String) PCinfo);

    }
}
