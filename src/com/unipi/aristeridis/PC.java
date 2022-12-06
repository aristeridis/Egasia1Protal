package com.unipi.aristeridis;

import java.util.ArrayList;
import java.util.List;

public class PC implements Ypologistis{
    List<String> specifications=new ArrayList<>();
    @Override
    public String getYpologistis() {
        return "PC";
    }
}
