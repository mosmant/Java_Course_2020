package Gun05;

public class _06_JavaString {
    public static void main(String[] args) {
        // ad="yeni gülcan"; tanımdan önce kullanılamaz
        int sayi =5;
        String ad="gülcan"; // String ifadelerin sayı gibi sınırı belli olmadığından
        String soyad="elif"; // "" ile sınırı belirtilir.

        System.out.println(ad); // -> gülcan -> çift tırnak yok ise değişkendir mutlaka
                               //              ve değeri yazılır
        System.out.println("ad"); // -> ad -> "" arasında ne varsa direk yazılır

        // Çift tırnak arasında yazılmayan her şey değişken olarak kabul edilir.
        
        // int toplam=a+b;
        String fullName="ad"+"soyad";
        System.out.println("fullName = " + fullName); // -> fullName = adsoyad

        fullName=ad+" "+soyad;
        System.out.println("fullName = " + fullName); // -> fullName = glcnElif

        int yas=18;
        int kilo=15;
        String bilgi=ad+" "+soyad+" "+ yas +" "+kilo;
        System.out.println("bilgi = " + bilgi); // -> gülcan kskl 18 15
        // toplama işleminde eğer bir tane bile string değişken varsa hepsi string kabul edilir sadece işlemde.

        bilgi=ad+" "+soyad+" yas="+ yas +" kilo="+kilo;
        System.out.println("bilgi = " + bilgi); // -> gülcan kskl yas=18 kilo=15

        bilgi=ad+" "+soyad+" "+ (yas +kilo); // bilgisayar önce parantezin için yapar yani sayısal toplar
        System.out.println("bilgi = " + bilgi); // -> gülcan elif 13
    }
}
