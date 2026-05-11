package com.bank.app.people;

public class Kisi {

    protected String ad;
    protected String soyad;
    protected String email;
    protected int telefonNumarasi;

    public Kisi(String ad, String soyad, String email, int telefonNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(int telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String toString() { //override
        return "Ad: " + ad + " Soyad: " + soyad;
    }
}