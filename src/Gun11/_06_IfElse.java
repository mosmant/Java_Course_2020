package Gun11;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir şifre giriniz=");
        String sifre = oku.nextLine();

        if ( sifre.length() >=8 && !sifre.toLowerCase().contains("pass") && sifre.length() <=12)
        {
            System.out.println("Tamam");
        }
        else
        {
            System.out.println("Uygun olmayan şifre");
        }
    }
}
