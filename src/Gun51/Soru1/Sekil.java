package Gun51.Soru1;

public class Sekil {

    @Override
    public String toString() {
        return "Sekil : Bilgi Yok";
    }

    public double getAlan()
    {
        throw new RuntimeException("Bu özellik kullanılamaz");
    }

    public double getCevre()
    {
        throw new RuntimeException("Bu özellik kullanılamaz");
    }
}
