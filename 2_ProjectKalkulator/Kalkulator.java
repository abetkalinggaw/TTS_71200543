package com.rplbo.utsnota;

public class Kalkulator {
    private int bil2;
    private int bil1;
    private String op;

    public Kalkulator(String BilanganString1,String BilanganString2, Operator Operator) {
        bil1 = Integer.parseInt(BilanganString1);
        bil2 = Integer.parseInt(BilanganString2);
        op = String.valueOf(Operator);
    }

    public Kalkulator(BilanganString dua, BilanganString tiga, Operator pangkat) {

    }

    public void hitung() {

    }
}
