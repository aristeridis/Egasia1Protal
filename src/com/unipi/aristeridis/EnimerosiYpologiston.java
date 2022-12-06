package com.unipi.aristeridis;

import java.util.Observable;
import java.util.Observer;

public class EnimerosiYpologiston extends Observable {

    private String PCinfo;

    public void setPCinfo(String PCinfo){
        this.PCinfo=PCinfo;
        setChanged();
        notifyObservers(PCinfo);
    }
}

