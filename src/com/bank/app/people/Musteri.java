package com.bank.app.people;
import com.bank.app.accounts.*;
import com.bank.app.cards.KrediKarti;
import java.util.ArrayList;
import java.util.Random;

public class Musteri extends Kisi { //inheritance
    private String musteriNumarasi;
    private ArrayList<Hesap> hesaplar;
    private ArrayList<KrediKarti> krediKartlari;
    public Musteri(String ad, String soyad, String email, int telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);

        Random random = new Random();
        this.musteriNumarasi = "MU" + (1000 + random.nextInt(9000));
        hesaplar = new ArrayList<>();
        krediKartlari = new ArrayList<>();
    }
    public void hesapEkle(String hesapTuru) {
        if (hesapTuru.equalsIgnoreCase("vadesiz")) {
            hesaplar.add(new VadesizHesap(0));
            System.out.println("Vadesiz hesap olusturuldu.");
        }
        else if (hesapTuru.equalsIgnoreCase("yatirim")) {
            hesaplar.add(new YatirimHesabi(0));
            System.out.println("Yatirim hesabi olusturuldu.");
        }
    }
    public void krediKartiEkle(double limit, double borc) {
        krediKartlari.add(new KrediKarti(limit, borc));
        System.out.println("Kredi karti eklendi.");
    }
    public void hesapSil(Hesap hesap) {
        if (hesap.getBakiye() > 0) {
            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
        }
        else {
            hesaplar.remove(hesap);
            System.out.println("Hesap silindi.");
        }
    }
    public void krediKartiSil(KrediKarti kart) {
        if (kart.getGuncelBorc() == 0) {
            krediKartlari.remove(kart);
            System.out.println("Kart silindi.");
        }
        else {
            System.out.println("Lütfen öncelikle borç ödemesi yapınız.");
        }
    }
    public ArrayList<Hesap> getHesaplar() {
        return hesaplar;
    }
    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }
    public String toString() { //override
        return "Musteri No: " + musteriNumarasi;
    }
}