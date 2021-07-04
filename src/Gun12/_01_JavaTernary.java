package Gun12;

import java.util.Scanner;

public class _01_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ie "tek" atayınız ve ekrana stringi yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int sayi = oku.nextInt();

        String text = "";

        // klasik yöntem
        if (sayi % 2 == 0)
            text = "çift";
        else
            text = "tek";
        System.out.println("text = " + text);

        // Ternary Operatör 2. yöntem
        text = (sayi%2==0) ? "çift" : "tek";
        System.out.println("text = " + text);

        // Ternary Operatör 3. yöntem direk yazdırma
        System.out.println("İşlem sonucu = " + ( (sayi%2==0) ? "çift" : "tek") );
    }
}
