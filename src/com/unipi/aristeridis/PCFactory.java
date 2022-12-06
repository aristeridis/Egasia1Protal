package com.unipi.aristeridis;

public class PCFactory implements AbstractFactory<Ypologistis>{
    @Override
    public Ypologistis create(String PCtype) {
        if ("PC".equalsIgnoreCase(PCtype)) {
        return new PC();
    } else if ("Laptop".equalsIgnoreCase(PCtype)) {
        return new Laptop();
    }

        return null;
    }
    }

