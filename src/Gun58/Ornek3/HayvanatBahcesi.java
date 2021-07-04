package Gun58.Ornek3;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi=new Kedi();
        kedi.setIsim("köpük");
        kedi.setVahsi(false);
        kedi.setDogumTarihi(LocalDate.of(2017,1,6));
        System.out.println("kedi = " + kedi);
//        kedi.gunlukUykuSuresi();
//        kedi.sesi();
        System.out.println(" **************  ");
        Kartal kartal=new Kartal();
        kartal.setIsim("Kartal");
        kartal.setVahsi(true);
        kartal.setDogumTarihi(LocalDate.of(2010,4,6));
        System.out.println("kartal = " + kartal);


    }
}
