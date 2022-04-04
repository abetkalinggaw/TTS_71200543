package com.rplbo.utskalkulator;

public class Main {
    public static void main (String[] args)
    {
        BilanganString b1 = new BilanganString("DuA BelaS");
        BilanganString b2 = new BilanganString("tiga BElAS");
        System.out.println("Apakah 2 digit?" + b1.apakahDuaDigit());
        System.out.println("Apakah lebih dari 10?" + b2.apakahLebihDari10());
        Operator op = new Operator("TaMbah");
        Kalkualtor k = new Kalkulator(b1,b2,op);
        k.hitung();
        Kalkulator k2 = new Kalkulator(new BilanganString("dua"), new BilanganString("tiga"), new Operator("pangkat"));
        k2.hitung();
    }
}
