package com.bank.app.accounts;

import java.util.Random;

public class Hesap {
    protected String iban;
    protected double bakiye;
    public Hesap(double bakiye) {

        Random random = new Random();
        this.iban = "TR" + (100000 + random.nextInt(900000));
        this.bakiye = bakiye;
    }
    public String getIban() {
        return iban;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public String toString() { //override
        return "IBAN: " + iban + " Bakiye: " + bakiye;
    }
}