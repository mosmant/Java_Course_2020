package Gun39._02_Ornek;

public class Ornek {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.

    public static void main(String[] args) {
        User mudur=new User("Ragip",Role.MUDUR,Statu.AKTIF);
        User satis=new User("Hamza",Role.SATIS,Statu.AKTIF);
        User kul=new User("Necdet",Role.PERSONEL,Statu.PASIF);

        UserSil(mudur);
        UserSil(satis);
        UserSil(kul);
//        User mudur=new User("Ragip",2,2);
//        User satis=new User("Hamza",2,1);
//        User kul=new User("Necdet",1,1);
//
//        if (kul.role == 1)
//        {
//            System.out.println("mudur silme");
//        }
    }

    public static void UserSil(User kullanici)
    {
        if (kullanici.role == Role.ADMIN)
        {
            System.out.println("silme işlemi yapıldı");
        }
    }


}
