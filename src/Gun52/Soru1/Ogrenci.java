package Gun52.Soru1;

public class Ogrenci {
    private int id;
    private String isim;
    private String tipi;

    private static int sayacID=1;

    public Ogrenci(String isim, String tipi) {
        this.id = sayacID++;
        this.isim = isim;
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
