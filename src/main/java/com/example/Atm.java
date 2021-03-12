package com.example;

public abstract class Atm {
    private static String s;

    public static String getS(){
        return s;
    }

    public static void setS(String s){
        Atm.s = s;
    }



    public abstract void setor(Integer nilai);
}
