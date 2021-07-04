package Gun39._03_Ornek;

import java.time.LocalDateTime;

public class Pizza {
    int miktar;
    PizzaSize buyukluk;
    //TODO: LocalDateTime siparisZamani; isleme al dendiğinde listede gözüksün

    public Pizza(int miktar, PizzaSize buyukluk) {
        this.miktar = miktar;
        this.buyukluk = buyukluk;
    }
}
