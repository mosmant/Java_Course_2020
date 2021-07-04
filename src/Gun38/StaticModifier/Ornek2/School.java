package Gun38.StaticModifier.Ornek2;

public class School {

    public static void main(String[] args) {

        Student ogr1=new Student("Elif","Kenighton");
        Student ogr2=new Student("Gülcan","Hamilton");
        Student ogr3=new Student("Ceyda","Denizhan");
//        ...
//        ...
//        ...
        Student ogr=new Student("Bige","Bergstein");

        System.out.println("Student.sayac = " + Student.sayac);

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        System.out.println("ogr = " + ogr);
    }

}

//Student.sayac = 4
//        ogr1 = Ogrenci{id='1'ad='Elif', soyadi='Kenighton'}
//        ogr2 = Ogrenci{id='2'ad='Gülcan', soyadi='Hamilton'}
//        ogr3 = Ogrenci{id='3'ad='Ceyda', soyadi='Denizhan'}
//        ogr = Ogrenci{id='4'ad='Bige', soyadi='Bergstein'}

// Static nasıl kullanılır ?
// CLASS adı ile kullanılır.
// NE İÇİN KULLANILIR ?
//1- Nesne tanımlayıp kullanmak yerine, t
//   anımlamadan kullanmak istediğimiz değişken veya metdolar için
//2- Tekrarlayan Nesnelere ait verileri tek bir değişkende toplamak için
//3- Nesneler için veya Genel için SAYAÇ olarak
//4- 3.Madde ile bağlantılı şekilde ID olarak








