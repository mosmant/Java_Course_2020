package Gun65.mainArgms;

import java.util.Scanner;

public class mainArguments {

    // programın başlangıcında parametre vermek için,
    //1- Önce programı RUN ediniz.
    //2-Menuden Run-> Edit Configuration a giriniz.
    //3-Program Argumnets satırına verilecek değerleri
    // arasında bir boşluk koyarak yazıp OK ye basınız.
    public static void main(String[] args) {

        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);

        for(String s: args)
        {
            System.out.println("s = " + s);
        }

//        System.out.println("Sayı giriniz=");
//        Scanner oku=new Scanner(System.in);
//        int rakam=oku.nextInt();


    }
}
