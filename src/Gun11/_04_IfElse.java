package Gun11;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle = oku.nextLine();

        if (cumle.length() > 10 && cumle.contains("study"))
        {
            System.out.println("Evet");
        }
        else
        {
            System.out.println("Hayır");
        }
    }
}
