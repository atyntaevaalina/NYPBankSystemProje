package com.bank.app.main;
import com.bank.app.accounts.Hesap;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.Musteri;

public class Main {
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri("Alina", "Atyntaeva", "alina@gmail.com", 55555);
        System.out.println("Müşteri oluşturuldu.");
        musteri1.hesapEkle("vadesiz");// Hesap oluşturma
        musteri1.hesapEkle("yatirim");
        System.out.println("Hesaplar oluşturuldu.");

        Hesap hesap1 = musteri1.getHesaplar().get(0);// Hesapları alma
        Hesap hesap2 = musteri1.getHesaplar().get(1);
        hesap1.setBakiye(5000);// Hesaba para ekleme

        System.out.println("İlk hesaba para yatırıldı.");
        System.out.println(hesap1);

        VadesizHesap vadesizHesap = (VadesizHesap) hesap1;// Para transferi
        vadesizHesap.paraTransferi(hesap2, hesap1, 1000);

        System.out.println("Transfer sonrası hesaplar:");
        System.out.println(hesap1);
        System.out.println(hesap2);

        musteri1.krediKartiEkle(10000, 2000);// Kredi kartı oluşturma
        KrediKarti kart1 = musteri1.getKrediKartlari().get(0);
        System.out.println("Kredi kartı oluşturuldu.");

        vadesizHesap.krediKartiBorcOdeme(kart1, 500);// Kart borcu ödeme
        System.out.println(kart1);

        hesap2.setBakiye(0);// Hesap silme işlemi
        musteri1.hesapSil(hesap2);
        kart1.setGuncelBorc(0); // Kart silme işlemi
        musteri1.krediKartiSil(kart1);
        System.out.println("Program başarıyla çalıştı.");
    }
}