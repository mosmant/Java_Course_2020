package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Ben buraya(kursa) neden geldim ?

        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize=");
        int vizeNotu = oku.nextInt();

        System.out.print("Final=");
        int finalNotu = oku.nextInt();

        double ort = vizeNotu * 0.4 + finalNotu * 0.6; // eğer sonucu double istiyorsak double eşitlemeliyiz.
        // eğer int istiyorsak int e eşitlemeliyiz.
        System.out.println("ort = " + ort);

//        int ortInt = (int)(vizeNotu * 0.4) + (int)(finalNotu * 0.6);
//        System.out.println("ortInt = " + ortInt);

         if (ort >= 60)
         {
             System.out.println("Tebrikler geçtiniz.");
         }
         else
         {
             System.out.println("Kaldınız");
         }
    }
}
