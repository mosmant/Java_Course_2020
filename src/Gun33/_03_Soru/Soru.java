package Gun33._03_Soru;

import java.util.ArrayList;

public class Soru {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
    // tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

    public static void main(String[] args) {
        Lesson mat101 = new Lesson();
        mat101.name = "Matematik";
        mat101.credit =3;

        Lesson java101 = new Lesson();
        java101.name = "Java";
        java101.credit =6;

        Lesson fiz101 = new Lesson();
        fiz101.name = "Fizik";
        fiz101.credit =4;

        Student ogrenci1 = new Student();
        ogrenci1.name = "Necdet";
        ogrenci1.maxCredit=10;
        ogrenci1.dersListesi = new ArrayList<>();

//        ogrenci1.dersEkle(mat101);
//        ogrenci1.dersEkle(java101);
//        ogrenci1.dersEkle(fiz101);

        if (ogrenci1.toplamKredisi()+ mat101.credit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(mat101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız");
        }

        if (ogrenci1.toplamKredisi()+java101.credit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(java101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız");
        }

        // bu ders max krediyi aştı ? bunun için ne yapabiliriz.
        if (ogrenci1.toplamKredisi()+ fiz101.credit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(fiz101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız");
        }


        for(Lesson les :  ogrenci1.dersListesi)
        {
            System.out.println(les.name + " " + les.credit);
        }

    }
}
