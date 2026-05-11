package com.bank.app.cards;

import java.util.Random;

public class KrediKarti {
    private String kartNumarasi;
    private double limit;
    private double guncelBorc;
    private double kullanilabilirLimit;

    public KrediKarti(double limit, double guncelBorc) {

        Random random = new Random();

        this.kartNumarasi = "KK" + (1000 + random.nextInt(9000));
        this.limit = limit;
        this.guncelBorc = guncelBorc;
        this.kullanilabilirLimit = limit - guncelBorc;
    }
    public String getKartNumarasi() {
        return kartNumarasi;
    }
    public double getLimit() {
        return limit;
    }
    public double getGuncelBorc() {
        return guncelBorc;
    }
    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }
    public String toString() { //Override
        return "Kart No: " + kartNumarasi + " Borc: " + guncelBorc;
    }
}