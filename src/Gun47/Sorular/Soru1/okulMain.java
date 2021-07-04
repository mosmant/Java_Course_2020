package Gun47.Sorular.Soru1;

import java.util.Scanner;

public class okulMain {
     public static void main(String[] args) {

        Okul okul1=new Okul("Kabataş Lisesi",3);


         Scanner oku=new Scanner(System.in);
         Scanner okuInt=new Scanner(System.in);

         int ogrenciSayisi=1;
         do{
             System.out.print(ogrenciSayisi+".Öğrenci Adı=");
             String ogrAd=oku.nextLine();

             System.out.print(ogrenciSayisi+".Öğrenci Soyadı=");
             String ogrSoyad=oku.nextLine();

             System.out.print(ogrenciSayisi+".Öğrenci Yaşı=");
             int ogrYas=okuInt.nextInt();

             try {
                 Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, ogrYas);
                 okul1.getOgrenciler().add(ogr);
                 ogrenciSayisi++;
             }
             catch (Exception ex)
             {
                 System.out.println(ex.getMessage());
                 System.out.println("Lütfen tekrara giriniz");
             }

         }while(ogrenciSayisi <= okul1.getMaxOgrenciSayisi() );





    }
}
