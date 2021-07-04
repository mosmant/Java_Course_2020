package Gun38.StaticModifier.Ornek1;

public class Okul {

    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Bige","Schwebinghaus");
        Ogrenci ogr2=new Ogrenci("Gülcan","Grifflinberg");
//        ...
//        ...
//        ...
        Ogrenci ogr500=new Ogrenci("Elif","Grifflinberg");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr500 = " + ogr500);
    }

}


//ogr1 = Ogrenci{ad='Bige', soyad='Schwebinghaus', okulAd='Brüder Grimm Schule'}
//ogr2 = Ogrenci{ad='Gülcan', soyad='Grifflinberg', okulAd='Brüder Grimm Schule'}
//ogr500 = Ogrenci{ad='Elif', soyad='Grifflinberg', okulAd='Brüder Grimm Schule'}
