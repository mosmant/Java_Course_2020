package Gun65.enum_ek;

public enum Aylar {
    OCAK(31, 1, "Ocak"),
    SUBAT(28, 2, "Şubat"),
    MART(30, 3, "Mart"),
    NISAN(31, 4, "Nisan"),
    MAYIS(30, 5, "Mayıs"),
    HAZIRAN(30, 6, "Haziran"),
    TEMMUZ(30, 7, "Temwuz"),
    AGUSTOS(30, 8, "Ağustos"),
    EYLUL(30, 9, "Eylül"),
    EKIM(30, 10, "Ekim"),
    KASIM(30, 11, "Kasım"),
    ARALIK(30, 12, "Aralık");

    private final int gunMiktari;
    private final int ayNo;
    private final String isim;

    Aylar(int gunMiktari, int ayNo, String isim) {
       this.gunMiktari=gunMiktari;
        this.ayNo=ayNo;
        this.isim=isim;
    }

    public int getGunMiktari() {
        return gunMiktari;
    }

    public int getAyNo() {
        return ayNo;
    }

    public String getIsim() {
        return isim;
    }
}
