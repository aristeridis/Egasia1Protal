package com.unipi.aristeridis;

import java.util.ArrayList;
import java.util.List;

public class Pelates {
    private String PCinfo;
    private List<Pelatis> pelates=new ArrayList<>();
    public void addObserver(Pelatis pelatis){
        this.pelates.add(pelatis);
    }
    public void removeObserver(Pelatis pelatis){
        this.pelates.remove(pelatis);
    }
    public void setPCinfo(String PCinfo){
        this.PCinfo=PCinfo;
        for(Pelatis pelatis :this.pelates){
            pelatis.update(this.PCinfo);
        }
    }
}
