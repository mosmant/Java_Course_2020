package Gun54.Ornek2;

public class Grafikler {
    public static void main(String[] args) {
        //bir interface in birden class tarafından implemente edilmesi
        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        //interface lerden nesne üretileme fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizilebilir cember2=new Cember();
        cember2.ciz();

    }
}
