package com.unipi.aristeridis;

public class Laptop extends PC implements Ypologistis{
    private String camera;
    private String mpataria;
    @Override
    public String getYpologistis() {
        return "Laptop";
    }
}
