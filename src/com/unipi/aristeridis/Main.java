package com.unipi.aristeridis;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        int a,b;
        System.out.print( "Dose arithmo Ypologiston gia paragwgi: " );
        a = myInput.nextInt();
        System.out.print( "Dose arithmo pelaton pou tha anameinoun: " );
        b = myInput.nextInt();
        Random rand = new Random();
        int euros_ypologiston=a;
        if (euros_ypologiston<=a && euros_ypologiston <=b){
            int tyxaio = rand.nextInt(euros_ypologiston);
    }
        Katastima kat1 = Katastima.INSTANCE.getInstance();
        System.out.println(kat1.getInfo());
        kat1.setInfo(Collections.singletonList("New LIst"));
        System.out.println(kat1.getInfo());
        EnimerosiYpologiston observable = new EnimerosiYpologiston();
        DiforopoiisiYpologiston observer = new DiforopoiisiYpologiston();
}
}