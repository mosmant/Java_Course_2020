package Gun33._01_Ornek;

public class JavaStaticveNonStaticMetodlar {

    public static void main(String[] args) {
        // Benim bütün programlarımda kullanacağım tip dönüşümleri için metodlara ihtiyacım var.
        // mesala int to string , string to int, vs. vs.. bunları yapan bir sinif yazınız.
        // ve bunları main de kullanarak gösteriniz.

        //1.yöntem : Javanın kendi metodlarıyla yapılan çevirme işlemleri
        int sayi=345;
        String strRakam = String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);

        //2.Yöntem : kendi sınıfımı yazayım getString(), getInt(), getDouble
//        Utility util = new Utility();
//        strRakam = util.getString(sayi);
//        intRakam = util.getInt(strRakam);

        //3.Yöntem : sınıfın direk adı ile kullanıyoruz.
        // Math mat=new Math();
        Math.random(); // gibi nasıl yaparız ?
        strRakam = Utility.getsString(sayi);
        intRakam = Utility.getsInt(strRakam);

    }

}
