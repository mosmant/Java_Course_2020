package Gun31._03_Ornek;

public class Kampus {

    public static void main(String[] args) {
        // Okul ve Ogrenci sınıfları olan bir yapı tasarlayınız.
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.numara =1;
        ogrenci1.Ad = "Mesut";
        ogrenci1.Soyad ="Demir";

        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.numara=2;
        ogrenci2.Ad="Gülcan";
        ogrenci2.Soyad="Bayrak";

        Okul okul1=new Okul();
        okul1.adi="Cumhuriyet";
        okul1.adres="Merkez Mah.";
        okul1.muduru="Ragıp";
        okul1.ucreti=20000;

        ogrenci1.Okulu = okul1;  //Okul ekleme : 1.Yöntem

        System.out.println("ogrenci1.okulu.adi = " + ogrenci1.Okulu.adi);
        System.out.println("ogrenci1.okulu.mudur = " + ogrenci1.Okulu.muduru);
        // öğrenci1 i yazdırınız bütün bilgilerini

        ogrenci2.Okulu = new Okul(); //Okul ekleme : 2.Yöntem
        ogrenci2.Okulu.muduru = "Hilal";
        ogrenci2.Okulu.ucreti = 30000;
    }


}
