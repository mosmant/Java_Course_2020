package Gun47.Ornekler.Ornek2;

public class arabaMAin {
    public static void main(String[] args) {
        Araba araba=new Araba();
        araba.setModel("bmw");
        araba.setRenk("kırmızı");
        araba.setMotor(1600);
        araba.setKapiSayisi(9);

        System.out.println("araba = " + araba);

        Araba araba2=new Araba
                ("Mavi","mercedes",
                        2000,9);

        System.out.println("araba2 = " + araba2);
    }
}
