package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Cavallo> arC = new ArrayList<Cavallo>();
        ArrayList<String> arS = new ArrayList<String>();

        for(int i = 0; i < 20; i++){
            Cavallo cav = new Cavallo(arS);
            arC.add(cav);
        }
        for(int i = 0; i < arC.size(); i++){
            arC.get(i).start();
        }
        for(int i = 0; i < arC.size(); i++){
            arC.get(i).join();
        }
        for(int i = 0; i < arS.size(); i++){
            System.out.println((i+1) + ":" + arS.get(i));
        }
    }
}