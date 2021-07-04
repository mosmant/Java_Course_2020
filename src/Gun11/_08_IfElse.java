package Gun11;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, begatif veya sıfır olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi = oku.nextInt();

        if (sayi > 0) {
            System.out.println("pozitif");
            System.out.println("pozitif");
        }
        else
            if (sayi < 0)
               System.out.println("negatif");
            else
                System.out.println("sıfır");


    }
}
