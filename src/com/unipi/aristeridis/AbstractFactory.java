package com.unipi.aristeridis;

public interface AbstractFactory<P> {
    P create(String PCtype);
}
