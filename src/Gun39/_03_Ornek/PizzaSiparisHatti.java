package Gun39._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Isleme Al
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // ISLEME AL (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        int secim = 0;
        ArrayList<Pizza> siparisler = new ArrayList<>();

        do {
            Menu();
            System.out.print("Seçiminiz =");
            secim = oku.nextInt();
            islemYap(secim, siparisler);
        } while (secim < 5);


    }

    public static void islemYap(int secim, ArrayList<Pizza> siparisler)
    {
        if (secim==4)
            islemeAl(siparisler);
        else
            siparisAl(secim, siparisler);
    }

    public static void islemeAl(ArrayList<Pizza> siparisler)
    {
        int mikSmall=0;
        int mikMedium=0;
        int mikLarge=0;

        for(Pizza p : siparisler)
        {
            switch (p.buyukluk)
            {
                case SMALL : mikSmall+= p.miktar;break;
                case MEDIUM: mikMedium+=p.miktar;break;
                case LARGE: mikLarge+=p.miktar;break;
            }
        }

        System.out.println("Small Pizza:"+mikSmall+" adet");
        // zamanları şunlar listesi
        System.out.println("Medium Pizza:"+mikMedium+" adet");
        // zamanları şunlar listesi
        System.out.println("Large Pizza:"+mikLarge+" adet");
        // zamanları şunlar listesi

        siparisler.clear();
    }

    public static void siparisAl(int secim, ArrayList<Pizza> siparisler) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Miktar=");
        int miktar = oku.nextInt();

        Pizza siparisEdilenPizza=null;
        switch (secim) {
            case 1:
                siparisEdilenPizza = new Pizza(miktar, PizzaSize.SMALL);
                break;
            case 2:
                siparisEdilenPizza = new Pizza(miktar, PizzaSize.MEDIUM);
                break;
            case 3:
                siparisEdilenPizza = new Pizza(miktar, PizzaSize.LARGE);
                break;

        }

        siparisler.add(siparisEdilenPizza);
    }


    public static void Menu() {
        System.out.println("***** PIZZA MENU *****");
        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4- Isleme Al");
        System.out.println("5- Çıkış");
    }


}

