package Gun16;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=oku.nextInt();

        int toplam=0;
        for(int i=1; i<sayi;i++) // for(int i=sayi-1;i>0;i--) // 1,2,3,4 veya 4,3,2,1
        {
            toplam=toplam+i;
        }

        System.out.println("toplam = " + toplam);
    }
}
