package Gun38.finalModifier.Ornek2;

public class Person {
    String isim;
    final int tcNo;

    static int tcNoSayac=100001;

    public Person(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
