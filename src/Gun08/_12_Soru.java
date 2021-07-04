package Gun08;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan tek okumada alacağınız 2 kelimelik ad ve soyadı ekrana
        // sadece isim başHarf.soysimBasharf. şeklinde yazdırınız.
        // yani Gülcan Elif -> G.E. olarak yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad ve Soyadınız = ");
        String tamAd=oku.nextLine(); // Gülcan Elif

        char adBasHarf= tamAd.charAt(0); // G
        int boslukIndex = tamAd.indexOf(" ");
        char soyadIlkHarf = tamAd.charAt(boslukIndex+1);

        System.out.println("Kısa Format Hali = " + adBasHarf+"."+soyadIlkHarf+".");
    }
}
