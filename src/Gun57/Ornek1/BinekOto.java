package Gun57.Ornek1;

public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    // implemente edilmek zorunda
    public abstract String getMarka();

    // ister override yapılabilir,
    // istenirse yapılmayabilir.
    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }
}
