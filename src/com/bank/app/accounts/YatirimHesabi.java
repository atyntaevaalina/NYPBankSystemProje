package com.bank.app.accounts;

public class YatirimHesabi extends Hesap {
    private String hesapTuru;
    public YatirimHesabi(double bakiye) {
        super(bakiye);
        hesapTuru = "Yatirim Hesabi";
    }
    public void paraEkle(double miktar) {
        bakiye += miktar;
        System.out.println(miktar + " TL eklendi.");
    }
    public void paraCek(double miktar) {
        if (bakiye >= miktar) {
            bakiye -= miktar;
            System.out.println(miktar + " TL cekildi.");
        }
        else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public String toString() { //override
        return hesapTuru + " " + super.toString();
    }
}