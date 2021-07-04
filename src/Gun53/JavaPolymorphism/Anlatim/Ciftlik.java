package Gun53.JavaPolymorphism.Anlatim;

import java.util.HashSet;
import java.util.Set;

public class Ciftlik {
    public static void main(String[] args) {
        Kopek kopek=new Kopek("karabaş");
        Kedi kedi=new Kedi("kopuk");

        kopek.ses();
        kedi.ses();
        kopek.kokladı();

        HashSet hs=new HashSet();
        Set hs1=new HashSet();
        // Set : kısmına Referans tipi
        // Hashset : Nesne tipi

        Hayvan kopek2=new Kopek("karabas2");
        Hayvan kedi2=new Kedi("pamuk");

        System.out.println("0---------------");
        kopek2.ses();  //referansı Hayvan olduğu için.
        kedi2.ses();   // referansı Hayvan olsuğu için

        System.out.println("1---------------");
        kopekSesi(kopek);
        kediSesi(kedi);

        System.out.println("2---------------");
        hayvanSesi(kopek2);
        hayvanSesi(kedi2);
    }

    public static void hayvanSesi(Hayvan hayvan)
    {
        //kopek2 buraya havan olarak geliyor
        // aslında yine Kopek sınıfından
        hayvan.ses();
    }

    // aşağıdaki 2 metod yerine yukarıdaki tek metod olarak kullanılabildi.
    public static void kopekSesi(Kopek kopek)
    {
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi)
    {
        kedi.ses();
    }

}
