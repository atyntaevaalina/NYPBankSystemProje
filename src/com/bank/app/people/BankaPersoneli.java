package com.bank.app.people;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi {
    private String personelID;
    private ArrayList<Musteri> musteriler;
    public BankaPersoneli(String ad, String soyad, String email, int telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);

        Random random = new Random();
        this.personelID = "PR" + (1000 + random.nextInt(9000));
        musteriler = new ArrayList<>();
    }
    public String getPersonelID() {
        return personelID;
    }
    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }
    public String toString() { //override
        return "Personel ID: " + personelID;
    }
}