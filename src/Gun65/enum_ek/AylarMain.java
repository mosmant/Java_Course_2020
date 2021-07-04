package Gun65.enum_ek;

public class AylarMain {
    public static void main(String[] args) {
        Aylar ay=Aylar.AGUSTOS;
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.gunMik= "+ ay.getGunMiktari());
        System.out.println("ay.getIsim() = " + ay.getIsim());
        System.out.println("ay.getAyNo() = " + ay.getAyNo());


//        ay.name() = AGUSTOS
//        ay.gunMik= 30
//        ay.getIsim() = Ağustos
//        ay.getAyNo() = 8

//        switch (ay)
//        {
//            case OCAK:
//                System.out.println(31);
//                break;
//            case SUBAT:
//                System.out.println(28);
//                break;
//            case MART:
//                System.out.println(30);
//                break;
//            case NISAN:
//                System.out.println(31);
//                break;
//            case MAYIS:
//                System.out.println(30);
//                break;
//            case HAZIRAN:
//                System.out.println(31);
//                break;
//        }




    }
}
