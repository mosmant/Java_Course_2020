package Gun49.Ornek2;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Hayvan hayvan=new Hayvan("yok", 0, "Genel");
        hayvan.konustu();

        Kopek kopek=new Kopek("beyaz", 10, "kangal");
        kopek.konustu();

        Kus kus=new Kus("gri",1,"muhabbet");
        kus.konustu();
    }
}
