package Gun42._03_TestZamani;

import org.junit.Assert;
import org.junit.Test;

public class _03_TestZamani {
    // Kullanıcının yazdığı metodu 2 adet test yazarak test ediniz.
    // TODO: Metod : aldığı bir sifrenin 8 karakterden az olmamasını ve
    // içinde en az bir rakam ve harf olup olmadığını kontrol eden metod olsun.

    @Test
    public void passCheck1()
    {
        // oluşan sonuç manasında actual denir
        boolean olusan=PasswordCheck.passCheck("bayrak5");

        // beklenen manasında expected denir;
        boolean beklenen=false;

        // 1.bölüm testera mesaj, 2.blüm expected, 3.bölüm actual
        // eğer hatalı olursa mesaj çıkacak
        Assert.assertEquals("false beklenyiordu true geldi" , beklenen, olusan);

        // mesaj vermek istenmiyorsa bu da olur
        //Assert.assertEquals( beklenen, olusan);
    }

    @Test
    public void passCheck2()
    {
        // oluşan sonuç manasında actual denir
        boolean olusan=PasswordCheck.passCheck("bayrak55");

        // beklenen manasında expected denir;
        boolean beklenen=true;

        // 1.bölüm testera mesaj, 2.blüm expected, 3.bölüm actual
        // eğer hatalı olursa mesaj çıkacak
        Assert.assertEquals("true beklenyiordu false geldi" , beklenen, olusan);

        // mesaj vermek istenmiyorsa bu da olur
        //Assert.assertEquals( beklenen, olusan);
    }



}
