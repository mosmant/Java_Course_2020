package Gun58.Ornek3;

import java.time.LocalDate;

public abstract class Hayvan {
    private static int sayac=0;

    private String isim;
    private boolean vahsi;
    private LocalDate dogumTarihi;
    private int id;

    public abstract void yiyecegi();
    public abstract void yemekMiktari();
    public abstract void gunlukUykuSuresi();
    public abstract void sesi();

    public Hayvan() {
        setId();
    }

    private void setId() {
        this.id = ++sayac;;
    }

    @Override
    public String toString() {
        System.out.print("yiyeceği=");  yiyecegi();
        System.out.print("yemekMiktari="); yemekMiktari();
        System.out.print("gunlukUykuSuresi=");gunlukUykuSuresi();
        System.out.print("sesi=");sesi();

        return "Hayvan{" +
                "isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi=" + dogumTarihi +
                ", id=" + id +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public int getId() {
        return id;
    }




}
