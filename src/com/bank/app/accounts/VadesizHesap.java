package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;

public class VadesizHesap extends Hesap {
    private String hesapTuru;
    public VadesizHesap(double bakiye) {
        super(bakiye);
        hesapTuru = "Vadesiz Hesap";
    }
    public void paraTransferi(Hesap aliciHesap, Hesap gonderenHesap, double miktar) {
        if (gonderenHesap.getBakiye() >= miktar) {
            gonderenHesap.setBakiye(gonderenHesap.getBakiye() - miktar);
            aliciHesap.setBakiye(aliciHesap.getBakiye() + miktar);
            System.out.println("Transfer basarili.");
        }
        else {
            System.out.println("Yetersiz bakiye.");
        }
    }
    public void krediKartiBorcOdeme(KrediKarti kart, double miktar) {
        if (this.bakiye >= miktar) {
            this.bakiye -= miktar;
            kart.setGuncelBorc( kart.getGuncelBorc() - miktar);
            System.out.println("Kredi karti borcu odendi.");
        }
    }
    public String toString() { //override
        return hesapTuru + " " + super.toString();
    }
}