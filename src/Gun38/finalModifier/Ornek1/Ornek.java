package Gun38.finalModifier.Ornek1;

public class Ornek {
    // bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde verilen saat, dakika ve saniyeyi alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {
        int gun = 23;
        int saat = 7;
        int dakika=25;

        int saniyeCinsinden=
                gun * Sabitler.hourInDay
        * Sabitler.minuteInHour * Sabitler.secondInMinute
                +
                saat * Sabitler.minuteInHour * Sabitler.secondInMinute
                +
                dakika * Sabitler.secondInMinute;

        System.out.println("saniyeCinsinden = " + saniyeCinsinden);
    }


}
