package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçtiniz,
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Notu giriniz=");
        int ogrNot = oku.nextInt();
        // ogrNot = 60 olsun
        if (ogrNot >= 50 )
        {
            System.out.println("Geçtiriniz, tebrikler.");
        }

        if (ogrNot < 50)  // hangi not girilirse girilsin burası herzaman kontorl edilir.
        {
            System.out.println("Kaldınız");
        }

        // Yukarıdaki iflerde herzaman kontrol edilme durumu vardır.
        // halbuki aşağıdaki IF-ELSE yapısında IF şartı çalıştığında ELSE
        // kontrol edilmesine gerek kalmaz.
        if (ogrNot>=50)
        {
            System.out.println("Geçtiniz, tebrikler");
        }
        else
        {
            System.out.println("Kaldınız");
        }
    }

}
