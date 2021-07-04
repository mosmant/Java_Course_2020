package Gun14;

import java.util.Scanner;

public class _05_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan Sıfır girilene sayı isteyiniz.
        // bu soruyu önce while ile çözünüz.Sonra do-While

        Scanner oku=new Scanner(System.in);
        int sayi;

        // normal while dan farkı döngüye mutlaka 1 kez girer, şart sonda kontrol edilir
        // şart sağlanıyorsa döngü devam eder.
        do{

            System.out.print("Sayı giriniz=");
            sayi = oku.nextInt();

        }while(sayi !=0 ); // do_wile döngüsü

    }
}
