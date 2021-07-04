package Gun47.Ornekler.Ornek1;

public class KisiMain {

    public static void main(String[] args) {
        Kisi necdetKisisi=new Kisi();

        necdetKisisi.ad ="Necdet";
        necdetKisisi.soyad="Demir";

        //necdetKisisi.yas= -25;
        necdetKisisi.setYas(-25);
        int yasi= necdetKisisi.getYas();
        System.out.println("necdetKisisi = " + necdetKisisi);

    }

}
