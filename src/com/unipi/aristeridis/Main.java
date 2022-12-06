package com.unipi.aristeridis;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int a, b;
        System.out.print("Dose arithmo Ypologiston gia paragwgi: ");
        a = myInput.nextInt();
        System.out.print("Dose arithmo pelaton pou tha anameinoun: ");
        b = myInput.nextInt();
        Random rand = new Random();
        int euros_ypologiston = a;
        int tyxaioPC = 0;
        int tyxaioLaptop=0;
        if (euros_ypologiston <= a && euros_ypologiston <= b) {
            tyxaioPC = rand.nextInt(euros_ypologiston);
        }
        tyxaioLaptop=tyxaioPC-euros_ypologiston;
        Katastima kat1 = Katastima.INSTANCE.getInstance();
        System.out.println(kat1.getInfo());
        kat1.setInfo("New info");
        System.out.println(kat1.getInfo());
        EnimerosiYpologiston observable = new EnimerosiYpologiston();
        DiforopoiisiYpologiston observer = new DiforopoiisiYpologiston();
        PCFactory pcf1 = new PCFactory();
        PC pc1=new PC();
        Laptop lpt1=new Laptop();
        for( int c=0;c<=tyxaioPC;c++){
            pcf1.create("PC");
           pc1.getYpologistis();
        }
        for (int c=0;c<=tyxaioLaptop;c++){
            pcf1.create("Laptop");
            lpt1.getYpologistis();

        }
    }
}