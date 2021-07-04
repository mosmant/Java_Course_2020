package Gun54.Ornek3;

// brden fazla interface den implemente edilebilir.
public class A4 implements IYazdirılabilir, IGosterilebilir {

    @Override
    public void goster() {
        System.out.println("göster");
    }

    @Override
    public void yaz() {
        System.out.println("yaz");
    }
}
