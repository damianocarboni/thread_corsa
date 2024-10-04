package com.example;

import java.util.ArrayList;

public class Cavallo extends Thread {
    int meta;
    ArrayList<String> a;
    public Cavallo(ArrayList<String> ar) {
        meta = 100;
        a = ar;
    }
    
   synchronized public void run(){
        for(int i = 0; i < meta; i++)
        {
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        a.add(this.getName());
    }
}
