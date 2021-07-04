package Gun54.Ornek4;

public class Test implements IGoster, IYazdir{

    @Override
    public void goster() {
        System.out.println("goster");
    }

    @Override
    public void yaz(String mesaj) {
        System.out.println(mesaj+" yaz");
    }

    @Override
    public void yaz() {
        System.out.println("yaz");
    }
    // implemente edilen interfaceler de aynı isim ve paramatrede
    // olan metdolardan bir tane yazmak yeterlidir,
    // problem oluşturmaz.
}
