package Gun53.JavaPolymorphism.Soru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci("Furkan", "demir", "başkan","8A" );
        Calisan calisan=new Calisan("Ebuzer","yılmaz", "muduryard","yönetim" );

        Kisi.kimlikYaz(ogrenci);
        Kisi.kimlikYaz(calisan);

        //((Ogrenci)ogrenci).getSube()
    }
}
