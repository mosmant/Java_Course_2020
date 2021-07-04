package Gun11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi = oku.nextInt();

        if ( sayi%2== 0)
        {
            System.out.println("çift");
        }
        else
        {
            System.out.println("tek");
        }
    }
}
