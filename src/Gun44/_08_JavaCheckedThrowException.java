package Gun44;

import java.util.Scanner;

public class _08_JavaCheckedThrowException {
    // kullanıcıdan hava sıcaklığını isteyiniz.
    // ayrı bir metodda bunun kontrolünü yaparak hava
    // sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz
    // mainden çağırarak hatayı kontrol ediniz.

    public static  void SicaklikKontrol(int sicaklik){

        if (sicaklik <=10 ){
            System.out.println("Hava gerçekten soğuk dışarı çıkma");
        }
        else
            System.out.println("Dışarıda basketbol oynayabilirsin");
    }


    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Hava Sıcaklığı = ");
        int sicaklik = oku.nextInt();

        try {
            SicaklikKontrol(sicaklik);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }


}
